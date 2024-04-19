package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        syntax
//        dataType[][] varName=new dataType[row][cols];
//        the size of cols is choice ,but size of rows must be specified
//        ex-
        int[][] a = new int[3][];
        int[][] b = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        System.out.println(b[0][0]);
//        can simply be understood as array of arrays
//        where each row from above is a single element ,and each row is an array by itself
//        the memory location is same as for the 1D array
//        where each a[i][j] is an object but not in continuous memory location
        int[][] ar={
                {1,2,3},
                {1},
                {2,3,4,5}
        };//the size of cols is not must
//    input for multi-D array
        int[][] R=new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                R[r][c]=sc.nextInt();
            }
        }
//        output
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(R[i][j]+" ");
            }
            System.out.println();
        }
        // another way
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(R[i]));
        }
//        as each row is a element by itself
        for (int[] d:R) {
            System.out.println(Arrays.toString(d));//prints each row
        }
    }
}
