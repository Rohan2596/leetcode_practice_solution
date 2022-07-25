package medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * * ************************
 * * Problem Statement****
 * ***********************
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to
 * wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 * <p>
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * Example 3:
 * <p>
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= temperatures.length <= 105
 * 30 <= temperatures[i] <= 100
 */

public class DailyTemperatures {
    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int size = temperatures.length;
        int answer[] = new int[size];
        Stack<Integer> temp = new Stack<>();
        temp.push(size - 1);
        for (int i = size - 2; i >= 0; i--) {
            while (!temp.isEmpty() && (temperatures[i] >= temperatures[temp.peek()])) {
                temp.pop();
            }

            answer[i] = temp.isEmpty() ? 0 : (temp.peek() - i);
            temp.push(i);
        }

        Arrays.stream(answer).forEach(System.out::println);

    }
}
