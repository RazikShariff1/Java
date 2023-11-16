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
                 for (int i=1;i<=a;i++){
                     System.out.print(" "+i);
                 }
//                   prints n Natural numbers
    }
}
