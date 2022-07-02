package easy;

/**
 * *******************************************
 * *********** Problem Statement **********
 * *******************************************
 * Largest Number At Least Twice of Others
 * You are given an integer array nums where the largest integer is unique.
 * <p>
 * Determine whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, or return -1 otherwise.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,6,1,0]
 * Output: 1
 * Explanation: 6 is the largest integer.
 * For every other number in the array x, 6 is at least twice as big as x.
 * The index of value 6 is 1, so we return 1.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: -1
 * Explanation: 4 is less than twice the value of 3, so we return -1.
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 0
 * Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 50
 * 0 <= nums[i] <= 100
 * The largest element in nums is unique.
 */
public class DominantIndex {

    public static void main(String[] args) {
        int[] nums = {1};
        boolean flag = false;
        if(nums.length==1){
            System.out.println(0);
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] >= 2 * nums[j]) {
                    flag = true;
                    count++;
                }
            }
            if (flag && count == (nums.length - 1)) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
