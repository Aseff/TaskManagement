import bean.Config;
import menu.Menu;
import util.MenuUtil;

public class StudentManagementSystem {
    public static void main(String[] args) throws Exception {
        Config.initialize();
            MenuUtil.showMenu();

//        Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
//        test(1);
//        test(0);
    }

//
//    public static void test(int i) {
//        System.out.println("bla");
//        if(i==0){
//            throw new IllegalArgumentException();
//        }
//    }
}
