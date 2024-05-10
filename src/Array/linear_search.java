package Array;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        System.out.print("Enter number of elements:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[10];
        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        System.out.print("Enter the search element:");
        int ele=in.nextInt();
        int pos=0;
        for (int i = 0; i < n; i++) {
            if (a[i]==ele){
                pos=i+1;
                break;
            }
            else pos=0;
        }
        if (pos>0) System.out.println("element found in the position "+pos);
        else System.out.println("Element not in the list");
//         if (pos>0) System.out.println("Element located at index "+pos);
//         else System.out.println("Element not in the list");
    }
}
class stringSrc{
    public static void main(String[] args) {
        if (strSrc("Razik",'m')) System.out.println("There");
        else System.out.println("not there");
    }
    static boolean strSrc(String str,char c){
        if(str.length()==0) return false;
        for (int i=0;i< str.length();i++) {
            if (str.charAt(i)==c) return true;
        }
        return false;
    }
}