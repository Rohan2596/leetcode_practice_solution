package medium;

import java.util.ArrayList;
import java.util.List;

/****
 * *********************
 * Problem Statement
 **********************
 *
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 *
 *
 * Follow up: If you have figured out the O(n) solution,
 * try coding another solution using the divide and conquer approach, which is more subtle.
 * */

public class MaximumSubArray {

    public static void main(String[] args) {

        int maxSum = -1;
        int [] nums= new int[] {-1};
        List<Integer> subArray = new ArrayList<>();
        if(nums.length==1){
            System.out.println(nums[0]);
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j <= nums.length; j++) {
                for (int k = i; k < j; k++) {
                    subArray.add(nums[k]);
                }
                Integer sum = subArray.stream().reduce(0, Integer::sum);
                if (sum >= maxSum) {
                    maxSum = sum;
                }
                subArray.removeAll(subArray);
            }
        }
        System.out.println(maxSum);
        //return maxSum;
    }
}
