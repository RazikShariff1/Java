package methods;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        nam(10);
        nam("hello");
        nam(20,30);
        //the function to be run is decided during the run time
        nam(1,2,3,4,5,6);
    }
    static void nam(int a, int b){
        System.out.println(a+b);
    }
    static void nam(int ...a){
        System.out.println(Arrays.stream(a).sum());
    }
    static void nam(int a){
        System.out.println(a);
    }
    static void nam(String a){
        System.out.println(a);
    }

}
