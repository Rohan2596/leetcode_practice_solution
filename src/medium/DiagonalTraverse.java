package medium;

import java.util.*;
import java.util.stream.Collectors;

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
      //  int[][] mat= {{1,2},{3,4}};
        int m= mat.length;
        int n=mat.length;
        int [] trans= new int[m*n];
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(diagonals.get((i+j))==null){
                    List<Integer>values= new ArrayList<>();
                    values.add(mat[i][j]);
                    diagonals.put(i+j,values);
                }
                else{
                    List<Integer>values= diagonals.get((i+j));
                    values.add(mat[i][j]);
                    diagonals.put(i+j,values);
                }
            }
        }
        List<Integer> elements=new ArrayList<>();
        for (Integer value:diagonals.keySet()) {
            if(value % 2 == 0){
            List<Integer> reverse= diagonals.get(value).stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
                elements.addAll(reverse);
            }else{
                elements.addAll(diagonals.get(value));
            }

        }
        for (int i = 0; i < elements.size(); i++) {
              trans[i]=elements.get(i);
        }
        Arrays.stream(trans).forEach(System.out::print);
    }
}
