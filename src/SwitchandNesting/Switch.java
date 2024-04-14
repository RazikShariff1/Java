package SwitchandNesting;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //vowel
        nestedSwitch ns=new nestedSwitch();
        ns.nestSwitch();
    }
}
class normalSwitch{
   void nswitch(){
       Scanner inp=new Scanner(System.in);
       System.out.print("Enter a char: ");
       char c=inp.next().charAt(0);
       switch (c) { //cursor on switch keyword+alt+enter to replace ----> the result is code provided down
           //ie enhanced switch without break
           case 'a' -> {
           }
           case 'e' -> {
           }
           case 'i' -> {
           }//similar cases are not allowed
           case 'o' -> {
           }
           case 'u' -> {
           }
           default -> System.out.println("not vowel");
       }
   }
    // similar ex for weekdays and weekends
}
class nestedSwitch{
    void nestSwitch(){
        Scanner inp=new Scanner(System.in);
        int id=inp.nextInt();
        String dep=inp.next();
        switch (id) {
            case 1 -> System.out.println("python");
            case 2 -> System.out.println("JavaScript");
            case 3 -> {
                System.out.println("Java");
                switch (dep) {
                    case "soft" -> System.out.println("software Development");
                    case "app" -> System.out.println("app Development");
                    default -> System.out.println("preselect dep");
                }
            }
            default -> System.out.println("enter valid id");
        }
    }
}
