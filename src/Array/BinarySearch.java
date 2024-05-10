package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={4,5,-2,3,6,91,-1};
        int d=match(a);
        System.out.println(d);
//        Arrays.stream(a).findFirst(9);
    }
    static int bs(int[] a,int s,int e,int tar){
        int mid=0;
        while(s<=e){ mid=s+(e-s)/2;
        if (a[mid]==tar) return a[mid];
        if (a[mid]>tar) return bs(a,s,mid-1,tar);
        if (a[mid]<tar) return bs(a,mid+1,e,tar);
        }
        return 0;
    }
    static int match(int[] a){
        int num=0;
        Arrays.sort(a);
        for (int i:a) {
            if(i>=0) num++;
        }
        int[] b=new int[num];
        for (int i=0, j=0;i<a.length;i++) {
            if(a[i]>=0) {
                b[j] = a[i];
                j++;
            }
        }
        for (int i = 0,j=b.length-1; i <a.length ; i++) {
            if (-1*a[i]==bs(a,0,a.length,-1*a[i])){
                return -1*a[i];
            }
        }
        return -1;

//    static int ls(int[] a,int tar){
//        for (int i:
//             a) {
//            if (i==tar) return tar;
//        }
//        return -1;
    }
}
