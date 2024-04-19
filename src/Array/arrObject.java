package Array;

import java.util.Scanner;

public class arrObject {
    //such as arr of strings
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i]=sc.next();
        }
        for (String m:str) {
            System.out.println(m);
        }
        str[2]="Java";
        System.out.println(str[2]);
    }
}
