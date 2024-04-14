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




