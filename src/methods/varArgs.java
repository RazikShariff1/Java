package methods;

import java.util.Arrays;

public class varArgs {
    //Variable number of arguments
    public static void main(String[] args) {
        int[] a={1,3,4,4,5,};
        arr(a);
        char[] b={'a','p','p','l','e'};
        ar(b);
        mixed(10,20,'f',"hellow"," world");
        //the order of arguments in mixed type should be maintained their type
    }

    static void arr(int ...a){
        //when the number of variables to pass is not known then three dots and a variable (...var)
        System.out.println(Arrays.toString(a));
    }
    static void ar(char ...w){
        System.out.println(Arrays.toString(w));
    }
    static void mixed(int a,int b,char f,String ...o){
        //the varagrs must come at the last while defining
        System.out.println(a+b+"f"+ o.length);
    }
}
