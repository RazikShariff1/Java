package methods;

public class Methods {
    public static void main(String[] args) {
        //  as we are using the function call in a static function the called function should also be static
//        int i=10;
//        print(i);
        pow(3,8);
    }
//    syntax:
//     access modifier return_type function_name(args){
//                  function body;
//                    return value; }
    static int print(int a){
        System.out.println(a);
        return 0;
    }
//    statements after return are not executed

    //function with multiple args
    static double pow(int a, int b){
        int pow=1;
        while(b!=0){
            pow=a*pow;
            b--;
        }
        System.out.println(pow);
        return 1;
//        the args passed must be in same order as the function definition
    }
}

//function with arguments  and return value
//function with arguments  and without return value
//function without arguments  and with return value
//function without arguments  and return value

//in java there is only pass by value ,no pass by reference
//simple example
class ex{
    public static void main(String[] args) {
        String name="Razik";
        change(name);
        System.out.println(name);
        int a=20,b=10;
        swap(a,b);
        System.out.printf("%d and %d",a,b);

    }
    static void change(String name){
        name="Shariff";
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
//run this class and see ,
//ie a new object is created where name is assigned similarly in main function

class scope{
    public static void main(String[] args) {
        int a = 10;
        {
//            int a = 20; =>cannot initilize again but can change
            a = 20;
            System.out.println(a);
            int b = 99;
        }
        System.out.println(a);
//        System.out.println(b); cannot access the the block variable out side
    }
}
class shadow{
    static int a=20;//a is shadowed a line 80,due to more preference to the lower priority in the block
    public static void main(String[] args) {
        System.out.println(a);
        int a=100;
        System.out.println(a);
        fun();
    }
    static void fun(){
        System.out.println(a);
    }
}