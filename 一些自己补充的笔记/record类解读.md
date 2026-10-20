`record` 是 Java 16 正式引入的一种**特殊类**，专门用来写“纯数据类”。

```java
public record User(Long id, String name, Integer age) {}
```

这一行，编译器会自动帮你生成：

- `private final` 字段：`id`、`name`、`age`
- 全参构造器：`new User(id, name, age)`
- 访问方法：`user.id()`、`user.name()`、`user.age()`
- `equals()`、`hashCode()`
- `toString()`

所以它确实很像 FastAPI 里 Pydantic `BaseModel` 的写法：都是**用类型声明数据结构**，代码很短，看起来就是“这个对象有哪些字段”。

但有一个关键区别：

| 对比点 | Java record | FastAPI BaseModel |
|---|---|---|
| 作用 | 不可变数据载体 | 请求/响应模型 + 校验 + 文档 |
| 校验 | 默认不校验类型 | 会自动校验字段类型 |
| 文档 | 不自动生成 OpenAPI | 自动生成 Swagger 文档 |
| 可变性 | 字段默认 `final`，不可改 | 通常可变 |

也就是说，Java 的 `record` 更像是一个**简化版的数据类**，它不会像 FastAPI 那样自动做请求校验、也不会自动生成接口文档。

如果你想在 Spring Boot 里达到类似 FastAPI 的效果，可以这样组合：

- **`record`**：定义请求体/响应体结构；
- **`@RequestBody` / `@Valid`**：做参数校验；
- **SpringDoc / Knife4j**：生成 OpenAPI 文档。

比如：

```java
public record CreateUserRequest(String name, Integer age) {}
```

```java
@PostMapping("/users")
public User create(@RequestBody @Valid CreateUserRequest req) {
    return userService.create(req.name(), req.age());
}
```

这样写起来，确实会有点 FastAPI 的感觉。

---
要不要说说 `@Valid` 校验具体怎么用，以及怎么自定义校验规则？


---

`@Valid` 本身只是**触发校验**，真正起作用的是你在对象字段上加的那些校验注解。下面按“依赖 → 基础用法 → 全局异常 → 自定义注解”说一遍。

### 1. 先加校验依赖

Spring Boot 3 一般用这个：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

如果是 Spring Boot 2，包名可能是 `javax.validation`；Spring Boot 3 是 `jakarta.validation`。

### 2. 在对象上加校验注解

```java
package com.example.demo.model;

import jakarta.validation.constraints.*;

public record CreateUserRequest(

        @NotBlank(message = "用户名不能为空")
        @Size(min = 2, max = 20, message = "用户名长度需在 2-20 之间")
        String name,

        @Min(value = 1, message = "年龄至少为 1")
        @Max(value = 150, message = "年龄不能超过 150")
        Integer age
) {}
```

常用注解有：

- `@NotNull`：不能为 null
- `@NotBlank`：字符串不能为 null、空串或纯空格
- `@Size(min, max)`：字符串长度、集合大小
- `@Min / @Max`：数值范围
- `@Email`：邮箱格式
- `@Pattern`：正则校验

### 3. Controller 里用 `@Valid` 触发

```java
@PostMapping("/users")
public User create(@RequestBody @Valid CreateUserRequest req) {
    return userService.create(req.name(), req.age());
}
```

校验失败时，Spring 会抛出 `MethodArgumentNotValidException`，方法体不会继续执行。

### 4. 统一处理校验错误

如果不处理，默认会返回一大段异常 JSON。建议加一个全局异常处理器：

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidation(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));
        return errors;
    }
}
```

这样校验失败会返回类似：

```json
{
  "name": "用户名长度需在 2-20 之间",
  "age": "年龄至少为 1"
}
```



### 5. 自定义校验注解

比如你想校验手机号。

#### 第一步：定义注解

```java
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {

    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
```



#### 第二步：写校验器

```java
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^1[3-9]\\d{9}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true; // 空值交给 @NotBlank 处理
        }
        return PHONE_PATTERN.matcher(value).matches();
    }
}
```



#### 第三步：使用

```java
public record RegisterRequest(

        @NotBlank(message = "手机号不能为空")
        @Phone(message = "手机号格式不正确")
        String phone
) {}
```

这样写起来，确实会越来越像 FastAPI 里 Pydantic 的字段校验：  
**`record` 定义结构 + 校验注解声明规则 + `@Valid` 触发校验 + 全局异常统一返回。**

如果你愿意，我可以用你之前的 `User` record 改写成一个完整的“创建用户接口”，把校验和异常处理都补全。


----

---
直接看同一套“创建用户”逻辑，两边怎么写。

### FastAPI 写法

```python
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel, Field

app = FastAPI()


class UserCreate(BaseModel):
    name: str = Field(..., min_length=2, max_length=20, description="用户名")
    age: int = Field(..., gt=0, le=150, description="年龄")
    phone: str = Field(..., description="手机号")


class UserResponse(BaseModel):
    id: int
    name: str
    age: int
    phone: str


users: list[UserResponse] = []
next_id = 1


@app.post("/users", response_model=UserResponse)
def create_user(user: UserCreate):
    global next_id
    if not user.phone.startswith("1") or len(user.phone) != 11:
        raise HTTPException(status_code=422, detail="手机号格式不正确")

    created = UserResponse(id=next_id, **user.model_dump())
    next_id += 1
    users.append(created)
    return created
```

### Spring Boot 写法

```java
package com.example.demo.model;

import jakarta.validation.constraints.*;

public record CreateUserRequest(

        @NotBlank(message = "用户名不能为空")
        @Size(min = 2, max = 20, message = "用户名长度需在 2-20 之间")
        String name,

        @Min(value = 1, message = "年龄至少为 1")
        @Max(value = 150, message = "年龄不能超过 150")
        Integer age,

        @NotBlank(message = "手机号不能为空")
        @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
        String phone
) {}
```

```java
package com.example.demo.model;

public record UserResponse(Long id, String name, Integer age, String phone) {}
```

```java
package com.example.demo.controller;

import com.example.demo.model.CreateUserRequest;
import com.example.demo.model.UserResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<UserResponse> users = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @PostMapping
    public UserResponse create(@RequestBody @Valid CreateUserRequest req) {
        Long id = idGenerator.getAndIncrement();
        UserResponse user = new UserResponse(id, req.name(), req.age(), req.phone());
        users.add(user);
        return user;
    }
}
```

### 主要区别

| 对比点 | FastAPI | Spring Boot |
|---|---|---|
| 模型定义 | `BaseModel` + `Field` | `record` / class + 校验注解 |
| 校验方式 | Pydantic 自动校验 | `@Valid` 触发 Bean Validation |
| 自定义校验 | `@validator`、`Field` 约束 | 自定义注解 + `ConstraintValidator` |
| 错误返回 | 默认返回 422 | 需要 `@RestControllerAdvice` 统一处理 |
| 文档生成 | 自动生成 Swagger/ReDoc | 需额外引入 SpringDoc / Knife4j |

### 直观感受

FastAPI 更“自动”：  
**模型写完，校验、文档、错误提示基本都自带。**

Spring Boot 更“显式”：  
**校验要加注解，错误要自己统一处理，文档要额外接插件。**

但 Spring Boot 的优势是生态更成熟，企业项目、数据库、权限、消息队列、部署方案都更完整。FastAPI 写起来轻快，Spring Boot 更像一套完整后端工程体系。