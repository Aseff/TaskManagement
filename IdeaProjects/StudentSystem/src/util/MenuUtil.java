package util;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import menu.Menu;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu(){
        Menu.showAllMenu();
        Scanner sc=new Scanner(System.in);
        int selectedNumber=sc.nextInt();

        Menu selectedMenu=Menu.find(selectedNumber);
        selectedMenu.process();


    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
