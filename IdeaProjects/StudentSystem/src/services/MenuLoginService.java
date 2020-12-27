package services;

import bean.Config;
import inter.MenuLoginServiceInter;
import menu.Menu;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void processLogic() {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=in.nextLine();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String password=sc.nextLine();

        if(!name.equals("asaf")  && !password.equals("7412369")){
            throw new IllegalArgumentException("username or password is incorrect");

        }

        Config.setLoggedIn(true);

    }
}
