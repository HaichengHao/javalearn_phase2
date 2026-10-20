import com.atguigu.d_category.CategoryinterfaceImpl;
import org.junit.Test;

import java.util.ArrayList;

public class CategoryTest {
//    public static void main(String[] args) {
//        CategoryinterfaceImpl category = new CategoryinterfaceImpl();
//        boolean result = category.addCategory("风","雨水","地球");
//        System.out.println(result);
//
//        ArrayList<String> all_c = category.queryAllcategory();
//        System.out.println(all_c);
//
//    }

    //但像上面这样写是麻烦的，所以测试功能最好还是要分开才好

    @Test
    public void addCategory(){
        CategoryinterfaceImpl category = new CategoryinterfaceImpl();
        Boolean b=category.addCategory("手机","箱包","水果","烟酒");
        System.out.println(b);
    }
    @Test
    public void queryAllcategory(){
        CategoryinterfaceImpl category = new CategoryinterfaceImpl();
        ArrayList<String> str1 = category.queryAllcategory();
        System.out.println(str1);
    }
}
