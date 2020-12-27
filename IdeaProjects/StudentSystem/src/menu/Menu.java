package menu;

import bean.Config;
import services.*;
import services.process.Process;
import util.MenuUtil;

public enum Menu {
    LOGIN("Please login", 1, new MenuLoginService()),
    REGISTER("Please register", 2, new MenuRegisterService()),
    ADD_TEACHER("Add a new teacher", 3, new MenuAddTeacherService()),
    ADD_STUDENT("Add a new student", 4, new MenuAddStudentService()),
    SHOW_ALL_TEACHER("show all teacher", 5, new MenuShowAllTeacherService()),
    SHOW_ALL_STUDENT("show all student", 6, new MenuShowAllStudentService()),
    UNKNOWN;

    private String label;
    private int number;
    private Process service;

    Menu() {

    }

    Menu(String label, int number, Process service) {

        this.label = label;
        this.number = number;
        this.service = service;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }


        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu(){

        System.out.println("Please select a menu");
        Menu[] menus=Menu.values();
        for (int i=0;i<menus.length;i++){
            if(menus[i]!=UNKNOWN){
                if(menus[i]==LOGIN || menus[i]==REGISTER){
                    if(!Config.isLoggedIn()){
                        System.out.println(menus[i]);
                    }

                }
                else  if(Config.isLoggedIn()){
                    System.out.println(menus[i]);
                }

            }




        }
    }
}
