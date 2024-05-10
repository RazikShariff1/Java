package Array;

import java.util.Arrays;

class LsIn2Darray {
    public static void main(String[] args) {
        int[][] arr = new int[][]//can also be initialized as
                {
                        {1, 2, 3, 4, 5},
                        {10, 20, 30, 40, 50},
                        {100, 200, 300},
                        {10000}
                };
//        int a=ls2d(arr,300);
//        System.out.println(a);
        int pos[] = ls2dpos(arr, 30);
        System.out.println(Arrays.toString(pos));
    }

    static int ls2d(int[][] a, int tar) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == tar)
                    return 1;
            }
        }
        return 0;
    }

    static int[] ls2dpos(int[][] a, int tar) { //array return
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == tar) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
