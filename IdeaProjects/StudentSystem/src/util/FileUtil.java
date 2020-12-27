package util;

import java.io.*;

public class FileUtil {
    public static boolean writeWithObject(Object object,String name) throws RuntimeException {
       try( FileOutputStream fo=new FileOutputStream(name);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);){
           objectOutputStream.writeObject(object);
           return true;
       }

       catch(Exception e){
           throw new RuntimeException(e);
        }
    }



    public static Object readWithObject(String name) throws Exception {
        Object obj=null;
        try(FileInputStream fileInputStream=new FileInputStream(name);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream))
        {
           obj= objectInputStream.readObject();
        } finally {
           return obj;
        }

    }
}
