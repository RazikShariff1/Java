package Inp_and_outp;

import java.io.File;
import java.util.Scanner;
public class Input_and_output {
    //    the keyword public is a access specifier
//    the class is a name group of properties and functions
//    the Input_and_output is the file name which is treated as class
    public static void main(String[] args) {
//  the main is the first function which will be executed in the class
//        Input_and_output i=new Input_and_output();
//        i.main();
//             makes no sense , as the main is first function to be executed when object is created
//             therefore the static is used for this purpose

//              output

        System.out.println("Hello Duniya");
//        is used to print output
//        sout shortcut
//        ctrl+click on the keywords to know more about them   ex: ctrl+ click on println

//               input

//        scanner class is used to take user input ,for that to create an object of that
//        we need to import the java.util.Scanner

        Scanner sc =new Scanner(System.in);
//        Scanner is a class
//        sc is the object of it ,it is a user defined name
//        new keyword is used to create a new object of it
//        Scanner() is a constructor
//        System.in is to take a user input from keyboard
//        it can be Scanner(file) ,to take file as a input .
//        similarly instead of out in sout ,the out keyword can be defined as file or some user requirement
//        ex: out=file;
    }
}
