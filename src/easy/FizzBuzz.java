package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Problem Statement **
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * <p>
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * <p>
 * Example 3:
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 != 0) {
                    fb.add("Fizz");
                }
                if (i % 3 != 0 && i % 5 == 0) {
                    fb.add("Buzz");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    fb.add("FizzBuzz");
                }
            } else {
                fb.add(String.valueOf(i));
            }
       }

        fb.stream().forEach(System.out::println);
    }
}
