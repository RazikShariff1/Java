package PremitiveDT;//every class starts with uppercase letter even the built in class
//the primitive types are not the classes can be seen in the examples below

import java.util.Scanner;

public class Primitive_DT {
    public static void main(String[] args) {
        System.out.println("سلام");//Java supports unicode values ,...know more about them on Google
        byte bt;
        int N_no=178;
        float Z_no=1.78f;
        char letters='D';
        long large_N_no=12345678910L;
        double large_Z_no=1234567.7777;
        Boolean Check=true;
        String name="Shariff";
        System.out.println(N_no+" "+ large_N_no);

//        --> all the integer values are treated as double to use them as float the f letter is added
//        similarly double

//        "for string"  and 'for char'

//        the data type which cannot be broke to further datatype are primitive datatype
//        ex:
//        String name="Razik"; can be further broke into char but char cannot be further

//        the int object can be created using Integer class ,can be identified form uppercase
        Integer rollno=12345;
//      rollno.    , the dot operator is used to access the properties and functions
        System.out.println(rollno.compareTo(N_no));
//        and many more
        int millions=2_000_000;

//        is same as 2,000,000
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int b=sc.nextInt();
//        nextInt to make it int type ,ie type conversion
//        similarly nextFloat();

        System.out.println("the input is "+b +" "+millions);

        System.out.println("to print string");
        String s=sc.next();
//        to take input of a word ,i.e till a tab space
//        even though the string is more than one word it takes a single word

        System.out.println(s);

//        String t=sc.nextLine();
//         to take input string of multiple words

//        System.out.println(t);
        sum sum=new sum(N_no,rollno);

    }
}
class sum{
    sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
}

//     when one type of data is assigned to another type of variable the automatic type conversion takes place under following
//     conditions
class typeCasting{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("at type casting");
        float i = inp.nextFloat();
        System.out.println(i);

//        even if the input is integer without decimal the output will be float type
//        this is only when the type is compatible ie, int to float not char to float
//        float i=inp.nextInt(); is correct because the size of float is greater than int ,but
//        can't be  int i=inp.nextFloat(); as int is smaller type than float
          int c='c';//automatic conversion ,store ASCII value
//        this is implicit conversion

//        to convert to int from float this is done explicitly

//        the explicit conversion is dne by adding (data_type)value_or_biggerVariable
//        ex:
        System.out.println((int) i);

//        type promotion
        int o=257;
        byte y=(byte)o;
        System.out.println(y); //it's returning 1 because the max range of byte is 256
//        1 because ,it's returning remainder 257 % 256 //
//        float*int-double = double   , simple understanding of type promotion
    }
}