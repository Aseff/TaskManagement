package services;

import bean.Config;
import bean.Student;
import bean.Teacher;
import inter.MenuShowALLTeacherServiceInter;

public class MenuShowAllTeacherService  implements MenuShowALLTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[] allteacher= Config.instance().getTeachers();
        for (int i=0;i<allteacher.length;i++){
            System.out.println(allteacher[i]);

        }
    }
}
