package easy;

import java.util.Arrays;

/**
 * *****************************
 * **** Problem Statement ****
 * ****************************
 *
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Example 2:
 *
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 *  Example 3:
 *
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 *
 * Constraints:
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 *
 * */

public class PlusOne {

    public static void main(String[] args) {

        int[] digits={9,8,7,6,5,4,3,2,1,0};
        StringBuilder builder= new StringBuilder("");
        for (int i = 0; i < digits.length; i++) {
              builder.append(digits[i]);
        }
        Long value = Long.parseLong(String.valueOf(builder)) + 1;

        System.out.println(value);
        int size=String.valueOf(value).length();
        int[] newDigits= new int[size];
        int i =(size-1);
        System.out.println(size);
        while (value>0 && i>=0){
            newDigits[i]= (int) (value%10);
            value=value/10;

            i--;
        }

        Arrays.stream(newDigits).forEach(System.out::print);





//        int [] newDigits=new int[value.length()];
//
//        for (int i = 0; i < value.length(); i++) {
//            newDigits[i]= value;
//            System.out.println(newDigits[i]);
//        }


    }
}
