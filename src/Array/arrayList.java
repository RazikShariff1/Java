package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        Dynamic array
//        similar to vectors in C++
//        syntax
//        ArrayList<wrapperClass> Var_name= new ArrayList<WrapperClass>();
        ArrayList<Integer> list =new ArrayList<Integer>();

//        list. (. dot operator) to perform some functions
//        list.add(1000000);
//        list.add(2000000);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.add(0,70000);
//        System.out.println(list);
//        list.clear();

        System.out.println(list);
        //and many more operations
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println(list.get(i));//to get element at index i
        }

    }
}
class multiArrayList{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //similar to multi-D array

        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
