package easy;

/**
 * ------Problem Statement--------
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
 * which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int sum = 0;
        char previous = 'Q';
        for (char value : roman.toUpperCase().toCharArray()) {

            switch (value) {
                case 'I':
                    previous = value;
                    sum = sum + 1;
                    break;
                case 'V':
                    if (previous == 'I') {
                        sum = sum + 3;
                        previous = value;
                    } else {
                        sum = sum + 5;
                        previous = value;
                    }
                    break;
                case 'X':
                    System.out.println(10);
                    if (previous == 'I') {
                        sum = sum + 8;
                        previous = value;
                    } else {
                        sum = sum + 10;
                        previous = value;
                    }
                    break;
                case 'L':
                    if (previous == 'X') {
                        sum = sum + 30;
                        previous = value;
                    } else {
                        sum = sum + 50;
                        previous = value;
                    }
                    break;
                case 'C':
                    System.out.println(100);
                    if (previous == 'X') {
                        sum = sum + 80;
                        previous = value;
                    } else {
                        sum = sum + 100;
                        previous = value;
                    }
                    break;
                case 'D':
                    if (previous == 'C') {
                        sum = sum + 300;
                        previous = value;
                    } else {
                        sum = sum + 500;
                        previous = value;
                    }
                    break;
                case 'M':
                    if (previous == 'C') {
                        sum = sum + 800;
                        previous = value;
                    } else {
                        sum = sum + 1000;
                        previous = value;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);

    }
}
