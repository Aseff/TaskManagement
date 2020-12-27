package bean;

import util.FileUtil;

import java.io.Serializable;

public class Config implements Serializable {

    private Student[] students=new Student[0];
    private Teacher[] teachers=new Teacher[0];
    private static Config config=null;
    private static boolean loggedIn;
    private static final String filename="app.txt";

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public  void appendStudent(Student s){
        Student[] newStudents=new Student[students.length+1];

        for (int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=s;
        students=newStudents;
    }

    public  void appendTeacher(Teacher t){
        Teacher[] newTeachers=new Teacher[teachers.length+1];

        for (int i=0;i<teachers.length;i++){
            newTeachers[i]=teachers[i];
        }
        newTeachers[newTeachers.length-1]=t;
        teachers=newTeachers;
    }


    public static Config instance(){
        if(config==null){
            config= new Config();
        }
        return config;
    }
    public static void initialize() throws Exception {
        Object obj=FileUtil.readWithObject(filename);
        if(obj==null){
            return;
        }
        if(obj instanceof Config){
            config= (Config) obj;
        }
    }

    public static void save(){
        FileUtil.writeWithObject(Config.instance(),filename);
    }


}
