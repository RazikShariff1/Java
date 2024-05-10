package Questions;

import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        int[] a={22,101,333,49,77};
//        evenDigCount(a);
//        secounlargnum(a);
//        revArr(a);
        int[][] ar={
                {1,2,3},
                {5,8}
        };
        maxwelth(ar);

//        int [] b={1,22,22,22,6,6,0,2,1,5,6,2,1,4,6,1};
//        removeDup(b);
    }
    static void evenDigCount(int[] a){
        int count=0;
        int[] b=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            int c=0;
            while (a[i]!=0){
                a[i]=a[i]/10;
                b[i]=++c;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]%2==0) count++;
        }
        System.out.println(count);
    }
    static void secounlargnum(int[] a){
        int max=-2147483648;
//        Arrays.sort(a);
//        for (int i = a.length-2; i < a.length-1; i++) {
//            System.out.println(a[i]);
//        }

//          without sorting
        for (int i = 0; i < a.length; i++) {
            max=Math.max(max,a[i]);
        }
        int max2=-2147483648;
//        System.out.println(max);
        for (int i = 0; i < a.length; i++) {
            if (a[i]==max){
                continue;
            }
            max2=Math.max(max2,a[i]);
        }
        System.out.println(max2);
    }
    static void revArr(int[] a){
        int[] b=new int[a.length];
        for (int j=0,i = a.length-1; i >=0 ; i--,j++) {
            b[j]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    static void removeDup(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] b=new int[a.length];
        for (int i=0,j = 0; i < a.length; i++) {
           if(a[i]!=a[++i]){
               b[j]=a[i];
               j++;
           }
        }
        System.out.println(Arrays.toString(b));
    }
    static void maxwelth(int[][] a){
        int[] b=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum=sum + a[i][j];
            }
            b[i]=sum;
        }
        System.out.println(Arrays.toString(b));
        int max=-2147483648;
        for (int i = 0; i < b.length; i++) {
            max= Math.max(max,b[i]);
        }
        System.out.println(max);
    }
}
