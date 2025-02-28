package stringTaskk;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class Task {
    public static void stringTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter word:");
        String name = scanner.next();
        //salas
       boolean txt= isPoolindrom(name);
        System.out.println(txt);



    }
    public static boolean isPoolindrom(String name){
        StringBuilder stringBuilder=new StringBuilder(name);
        return stringBuilder.reverse().toString().equals(name);
    }
}
