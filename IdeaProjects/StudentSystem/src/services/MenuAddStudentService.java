package services;

import bean.Config;
import bean.Student;
import inter.MenuAddStudentServiceInter;
import services.process.SaveableProcess;
import util.FileUtil;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter, SaveableProcess {
    @Override
    public void processLogic() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();

        Scanner sc2=new Scanner(System.in);
        System.out.println("enter surname:");
        String surname=sc2.nextLine();

        Student s=new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("Student is added");

        FileUtil.writeWithObject(Config.instance(),"app.obj");
    }
}
