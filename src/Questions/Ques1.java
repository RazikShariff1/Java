package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
//        maxWithoutArr();
        char[] a={'a','h','c'};
//        closest2zero(a);
        char c=c(a,'b');
        System.out.println(c);
//        System.out.println();
//        System.out.println(n);
    }
    static void maxWithoutArr(){
        int max=0;
        for (int i = 0; i < 5; i++) {
            Scanner in=new Scanner(System.in);
            max=Math.max(max,in.nextInt());
        }
        System.out.println(max);
    }
    static int closest2zero(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (a[i] <= -1 * a[i - 1]) return a[i];
                else return a[--i];
            }
        }
        if (a[a.length-1]<0) return a[a.length-1];
        return 0;
    }
    static char c(char[] a,char tar){
        Arrays.sort(a);
        int s=0;
        int e=a.length;
        int mid=0;
        while(s<=e){
            mid=(s+e)/2;
            if ((int)a[mid]==(int)tar) return a[mid];
            if ((int)a[mid]>tar){
                s=0;
                e=mid-1;
            }
            if ((int)a[mid]<tar){
                s=mid+1;
                e=a.length-s-1;
            }
            else return (char)e;
        }
        return '0';
    }
}
