package util;

import java.util.Scanner;

public class Inpututil {

    static Scanner sc=new Scanner(System.in);

    public static int getint(String message) {
        System.out.println(message);
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    public static String getString(String message){
        System.out.println(message);
        return sc.nextLine();
    }
}
