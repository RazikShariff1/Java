package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int[] a={0,1,0,2,1,0,1,3,2,1,2,1};
        int water=water(a);
        System.out.println(water);
    }
    static int water(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            int max1,m=0;
            int max2=0;
           if (a[i]>m){
               max1=max2;
               max2=i;
               for (int j = max1; j <max2 ; j++) {
                   sum=sum+(max1-a[i]);
               }
               m=max2;
           }
        }
        return sum;
    }
}
class so{
    public static void main(String[] args) {
//        int[] a={-1,2,5,9,40,55,200,565};
//
//       int n=binarySearch(a,0,a.length-1,55);
//        System.out.println(n);
        int[] m={7,1,5,3,6,4};
        maxProfit(m);
    }
   static int maxProfit(int[] prices) {
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        return  0;
//        return (prices[prices.length-1]-prices[0]);
    }
    static int countPrimes (int n) {
        int m=0;
        for(int i=2;i<n;i++){
            if(check(i)) m=m+1;
        }
        return m;
    }
    static boolean check(int i) {
        if (i==4) return false;
        if (i<0){
            return false;
        }
    else{
        int m=i/2;
        for(int j=2;j<m;j++){
            if(i%j==0){
            return false;
            }
        }
    }
        return true;
    }
    static int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

