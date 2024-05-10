package Questions;

import java.util.Arrays;

public class Ques5 {
    public static void main(String[] args) {
        int[] a={3,2,6,5,0,3};
        int stock=stock(a);
        System.out.println(stock);
    }
    static int area(int[] a){
        int l=a.length-1;
        int area=0;
        for (int i = 0; i <l; i++) {
                area=Math.max(area,Math.min(a[i],a[l])*(l-i));
            System.out.println(area+" ");
        }
        return area;
    }
    static int stock(int[] a){
        int max=0,min=100000;
        int l=a.length;
        for (int i=0;i<l;i++){
            min=Math.min(min,a[i]);
            System.out.println(min);
        }
        if (min==a[l-1]) {
            for (int i=0,j=1;j<l;j++){
                max=Math.max(max,a[j]-a[i]);
            }
            return (max>0)? max:0;
        }
        for (int i = 0; i <l ; i++) {
            if (min==a[i]){
                int j=i+1;
                while (j<l){
                    max= Math.max(max,a[j]);
                    j++;
                }
            }
        }
        return max-min;
    }
    static int bS(int arr[], int l, int r, int x)
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
