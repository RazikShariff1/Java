package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Basic{
    //based on primitives
    public static void main(String[] args){
        //syntax  =>  datatype [] variable_name=new datatype[size]
//        int[] a= new [10];
        Scanner sc=new Scanner(System.in);
        int[] a;//declaration
        a=new int[10];//object creation
        int[] aa={11,22,33,44};//initialization
//        the object is created at the run time
//        the new keyword is used to create object
//        the object creation is done at the runtime dynamically
//        the elements may or may not be continuous
//        the object are crated in the heap memory
//        the reference variable will be point to the object in heap
//        imp
//        => each element in the object(ex:- array element) will be treated as a unique object
//        => these objects may or may not be in continuos memory location(different memory locations)
//        1 is separate object and 2,3,... where the parent object is {1,2...}
        System.out.println(a[0]);//=>0
        String[] str=new String[10];
        System.out.println(str[0]);// null

//        Assignment
//        single
        a[0]=101;
//        for n (runtime)
        int n=3;
        for (int i = 1; i <=n; i++) {
            a[i]=sc.nextInt();
        }

//        single output
        System.out.println(aa[1]);
//        multiple output
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
        }
        //enhanced for loop
        for (int i:a) {
            System.out.println(a[i]);//where i represents each element of a[]
        }
        System.out.println(Arrays.toString(a));//built-in func()
    }
}