package services;

import bean.Config;
import bean.Student;
import inter.MenuShowAllStudentServiceInter;

public class MenuShowAllStudentService implements MenuShowAllStudentServiceInter {
    @Override
    public void processLogic() {
        Student[] allstudents= Config.instance().getStudents();
        for (int i=0;i<allstudents.length;i++){
            System.out.println(allstudents[i]);

        }

    }
}
