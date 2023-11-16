package Conditiona;

import java.util.Scanner;
public class Conditions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
//       simple if:
//              if(condition){
//              stmt;  }

//        if else
         if (a<=10){
            System.out.println("ok");
        }
        else {
            System.out.println("not ok");
        }

//        multiple if-else
        if(a<5){
            System.out.println("less than 5");
        }
        if (a<6){
            System.out.println("less than 6");
        }
        else {
            System.out.println("greater than 6");
        }

    }

}
