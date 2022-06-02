package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *******************************
 * ******* Problem Statement *****
 * *******************************
 *
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 *
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 * Follow up: Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.
 * */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int [] nums= new int[]{1,1};
        List disappeared=new ArrayList<>();
        int start= 1;
       nums= Arrays.stream(nums).sorted().toArray();
        while (start<=nums.length){
            boolean check= true;
            for (int num:nums) {
                if(start==num){
                    check=false;
                }
            }
            if(check ){
                disappeared.add(start);
            }
            start++;
        }

        disappeared.stream().forEach(System.out::println);

    }
}
