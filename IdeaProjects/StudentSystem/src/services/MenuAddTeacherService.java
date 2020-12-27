package services;

import bean.Config;
import bean.Student;
import bean.Teacher;
import inter.MenuAddTeacherServiceInter;
import services.process.SaveableProcess;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter, SaveableProcess {
    @Override
    public void processLogic() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();

        Scanner sc2=new Scanner(System.in);
        System.out.println("enter surname:");
        String surname=sc2.nextLine();

        Teacher t=new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher is added");

    }
}
