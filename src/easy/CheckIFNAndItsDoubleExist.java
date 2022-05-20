package easy;

/**
 * **************************
 * ****Problem Statement*****
 * **************************
 * <p>
 * Given an array arr of integers,
 * check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <p>
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * <p>
 * Example 1:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * <p>
 * <p>
 * Example 2:
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * <p>
 * Example 3:
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 * <p>
 * Constraints:
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 */

public class CheckIFNAndItsDoubleExist {

    public static void main(String[] args) {

        int[] nums = new int[]{0,0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == (2 * nums[j])) {
                        System.out.println(nums[i]);
                        System.out.println(true);
                        break;
                    }
                }
            }
        }
        System.out.println(false);
    }
}
