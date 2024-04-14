package Loops;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.println("enter a N number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //to repeat a block of code under some condition again and again until that condition is satisfied

//        for(declaration ; condition; updating )
//        {...........body............}
//           ex
                 for (int i=1;i<=a;i++) {
                     System.out.print(" " + i);
                 }
//                   prints n Natural numbers

//        fori to get
//        for (int i = 0; i < ; i++){  } //shortcut


//        syntax for while loop

//        initialization
//        while (condition){.........body...........;
//        update}
        int i= sc.nextInt();
        while (i<=7){
            System.out.println("hello");
            i++;
        }

//        syntax of do while loop
//                do{ .................body.........;
//                i++;}while(condition);
        do {
            System.out.println("do do");
            i++;
        }while (i<=9);
//        the use of for loop , while loop and do while loop is
//        => when the is sure about the number of iteration  then the for loop is used
//        => if the user is unknown of the number of iteration then the while loop is used
//        => the do while is used if the of the loop is to be executed least once
    }
}
