package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a={100,200,102,88,1000,500,504};
        maxx(a);//similarly perform the same for a range of elements from the array ex:from index1 to index2
//        maxOfRange(a,0,3);
        reverse(a);
        System.out.println(Arrays.toString(a));

//        System.out.println("Enter two numbers:");
//        max=Math.max(in.nextInt(),in.nextInt());
//        System.out.println(max);


//        int[] arr={1,2,3,4,5};
//        swap(arr,1,4);
//        System.out.println(Arrays.toString(arr));

    }
    static  void swap(int a[],int idx1,int idx2){
        int temp=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=temp;
    }
    static void maxx(int a[]){ //similarly minn()
//        int max=0;
//        for (int i = 0; i < a.length; i++) {
//            max=Math.max(max,a[i]);
//        }
        int max=a[0];
        for (int i = 0; i < a.length; i++)
         if (a[i]>max) max=a[i];
        System.out.println(max);
    }
    static void maxOfRange(int a[],int start,int end){
        int max=a[start];
        for (int i = start; i <end ; i++) {
            if (max<a[i]) max=a[i];
        }
        System.out.println(max);
    }
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while (start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
}
//similarly max[][] and min[][] functions in 2D array