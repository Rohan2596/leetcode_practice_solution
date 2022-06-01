package easy;


import java.util.Arrays;

/**
 * ********************************************
 * ********** Problem Statement ***************
 * ********************************************
 * <p>
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 * <p>
 * -----Example 1:----------
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * <p>
 * -------Example 2:-------
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist,
 * so the maximum (2) is returned instead.
 * <p>
 * ---Example 3----------
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2
 * (both 2's are counted together since they have the same value).
 * The third distinct maximum is 1.
 * <p>
 * -----Constraints--------
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 * <p>
 * Follow up: Can you find an O(n) solution?
 */

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        nums = Arrays.stream(nums).sorted().distinct().toArray();

        if (nums.length >= 3) {
            System.out.println(nums[nums.length - 3]);
        }

        if (nums.length == 2) {
            System.out.println(nums[nums.length - 1]);
        }
        System.out.println(nums[0]);
    }

}
