package medium;

import java.util.Arrays;

/***
 *************************************
 * *** Problem Statement *********
 **************************************
 *
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 *
 * Example 1:
 *
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,4,7,5,3,6,8,9]
 * Example 2:
 *
 * Input: mat = [[1,2],[3,4]]
 * Output: [1,2,3,4]
 *
 *
 * Constraints:
 *
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * -105 <= mat[i][j] <= 105
 * */

public class DiagonalTraverse {

    public static void main(String[] args) {

        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
       // int[][] mat= {{1,2},{3,4}};
        int m= mat.length;
        int n=mat.length;
        int [] trans= new int[m*n];
        // 0*0  1*1 2*2
        //  0+0  +4   4
 int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println( "i:- "+ i +" j:- "+ j +" == " +mat[i][j]);
                if(i==j){
                    System.out.println((i*j)*4);
                    int value= (i*j)*m;
                    trans[2*((i+j)/m)]=mat[i][j];
                }
               // if()
            }
        }
        Arrays.stream(trans).forEach(System.out::print);
    }
}
