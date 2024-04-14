package Loops;

import java.util.Scanner;

//based on numbers
public class practice2 {
    public static void main(String[] args) {
//        repeatedNum rn=new repeatedNum();
//        rn.count();
        Scanner inp=new Scanner(System.in);
//        int n=19998;
//        System.out.println();
//        System.out.print("Enter a number: ");
        /* reverse
        reverse r=new reverse();
        r.rev(inp.nextInt());*/
        calculator calc=new calculator();
        calc.calc();
    }
}
class repeatedNum{
    //first trial ,*redundant,without using count()
    void count(){
        Scanner inp=new Scanner(System.in);
        long n=inp.nextLong();
//        System.out.print("Enter count Element: "); {should work on this}
        int m=inp.nextInt();
        String str=n+"";
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '1' -> count1++;
                case '2' -> count2++;
                case '3' -> count3++;
                case '4' -> count4++;
                case '5' -> count5++;
                case '6' -> count6++;
                case '7' -> count7++;
                case '8' -> count8++;
                case '9' -> count9++;
            }
        }
        System.out.println(count7); //should work client base choice
    }
}
class reverse{
    void rev(int n){
        int a=0,rev=0;
        while (n>0){
            a=n%10;
            n=n/10;
            rev=rev*10+a;
//                 leetcode submission pending .
//
//           issue-> [-2^31, 2^31 - 1], then return 0
//            int nature=1;
//            if(x>0)
//                nature=1;
//            else if(x<0)
//            {
//                nature=-1;
//                x=-x;}
//            int a=0,rev=0;
//            while (x>0){
//                a=x%10;
//                x=x/10;
//                rev=rev*10+a;}
//            return rev*nature;

        }
        System.out.println(rev);
    }
}
class calculator{
    //--> a calculator with basic arithmetic operations
    //--> to exit from calc mode type 'x' or 'X' in terminal input
    void calc(){
        Scanner inp=new Scanner(System.in);
        while (true){
            System.out.print("Enter the operator: ");
            char op=inp.next().trim().charAt(0);
            int ans=0;
            if(op=='+' || op=='-' || op=='*' || op=='/' || op =='%'){
                System.out.println();
                int num1=inp.nextInt();
                int num2=inp.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                if(op=='/'){
                    ans=num1/num2;
                }
            }
            System.out.println("Result is "+ans);
        }
    }
}
