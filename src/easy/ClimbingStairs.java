package easy;

/**
 * ***************************
 * **** Problem Statement ****
 * ***************************
 * <p>
 * <p>
 * You are climbing a staircase.
 * It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * **************
 * ***Example 1:
 * *************
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * *************
 * ****Example 2:
 * **************
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * <p>
 * Constraints:
 * 1 <= n <= 45
 */

public class ClimbingStairs {

    public static void main(String[] args) {
        //0 1 2 3 4 5 6  7
        //1 1 2 3 5 8 13 21
        int n = 7;
        int prevSum=1;
        int sum=1;
        int [] fib0= new int[n+1];
        fib0[0]=1;
        fib0[1]=1;
        for (int i = 2; i <fib0.length ; i++) {

            fib0[i]=fib0[i-1] +fib0[i-2];
        }
        System.out.println(fib0[n]);
    }
}
