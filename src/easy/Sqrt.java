package easy;


import java.util.Arrays;

/**
  *******************************
  ****** Problem Statment******
  *******************************
 *
 * Given a non-negative integer x,
 * compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 *
 * Note: You are not allowed to use any built-in exponent function or operator,
 * such as pow(x, 0.5) or x ** 0.5.
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 *
 * Example 2:
 * Input: x = 8
 * Output: 2
 *
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

 * Constraints:
 *
 * 0 <= x <= 231 - 1

 *
 *
* */
public class Sqrt {
    public static void main(String[] args) {
        int x= 8;
        int roots[]= new int[x];
        int root=0;
        for (int i = 0; i < roots.length; i++) {
            roots[i]=i;
            int value= i*i;
            if(value<=x){
                root=i;
            }
            if(x==1 || x==2){
                root=x;
            }

            if(value>x){
                break;
            }
        }
        System.out.println(root);
    }
}
