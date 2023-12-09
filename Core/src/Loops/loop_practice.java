package Loops;
import java.util.Locale;
//based on strings and chars
import java.util.Scanner;
import java.lang.String;//to take string inputs ,to perform some operations,it need to be import
public class loop_practice {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
//        System.out.println("Enter a number: ");
        /* int to ASCII
     int n= inp.nextInt();
     System.out.println((char)n);
         */

//        int[] a=new a[5];

        /*   left pyramid
        for (int i = 0; i <=n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
         */ /*max of 3
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
//        for (int i = 0; i <=3 ; i++) {
            System.out.println(Math.max(c,(Math.max(a,b))));
//        }
    */
        //central pyramid
       /* for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }*/

        /*caseConvertor cS=new caseConvertor();
        cS.convertor();*/

        /*asciiToInt cs=new asciiToInt();
        cs.convertor();*/

/*        trim() -> trims the spaces till charAt(0)
       char c=inp.next().trim().charAt(0);
       System.out.println(c);*/

        /* caseCount
        caseCount cc=new caseCount();
        cc.count();*/

        strongPass passcheck=new strongPass();//should correct logic
        passcheck.passCheck();
    }
}
class caseConvertor{
    void convertor(){
        Scanner inp=new Scanner(System.in);
        System.out.print("1-> toUpper\n2-> toLower");
        System.out.print("\n\tEnter your data: ");
        String s=inp.nextLine();
        System.out.print("\n\tEnter your choice: ");
        int n=inp.nextInt();
        switch (n){
            case 1:
                System.out.println(s.toUpperCase());
                break;
            case 2:
                System.out.println(s.toLowerCase());
            default:
                System.out.println("Invalid choice");
        }
    }
}
// pending
class caseCount{
    void count(){
        System.out.print("Enter a string: ");
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        int countU=0,countL=0;
        for (int i = 0; i <str.length() ; i++) {
            int n=(int)str.charAt(i);
            if(n>=65 && n<=90)
                countU++;
            else
                countL++;
        }
        System.out.printf("UpperCaseCount:%d \nLowerCaseCount:%d",countU,countL);
    }
}
class asciiToInt{
    Scanner inp=new Scanner(System.in);
    void  convertor(){
        System.out.println("enter a word");
        String str=inp.next();
        for (int i = 0; i <str.length() ; i++) {
            int n=(int) str.charAt(i);
            System.out.printf("%d ",n);
        }
    }
}
class strongPass{
    void passCheck(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String s=inp.next();
        boolean symbl=false,upcase=false,lowcase=false,num=false;
        int len=8;
        char c;
        for (int i = 0; i <s.length() ; i++) {
            c=s.charAt(i);
            if(c>='a' || c<='z')
                   lowcase=true;
            if(c>='A' || c<='Z')
                   upcase=true;
            if(c>='1' || c<='9')
                   num=true;
            if(c>=':' || c<='/')
                   symbl=true;
        }
        if (symbl && upcase && lowcase && num && s.length()>=len)
            System.out.println("Strong");
        else
            System.out.println("weak");
    }
}