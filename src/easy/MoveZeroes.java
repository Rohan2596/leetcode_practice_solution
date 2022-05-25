package easy;

import java.util.Arrays;

/**
 * *****************************
 * *******Problem Statement*****
 * *****************************
 *
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 *
 * */

public class MoveZeroes {
    public static void main(String[] args) {

        int [] arr= new int[]{0,1,0,3,12};
        int [] zeros= new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zeros[(arr.length-1)]=arr[i];
             //   j++;
            }
            if(arr[i]!=0){
                zeros[j]=arr[i];
                j++;
            }
        }

        for (int i = 0; i < zeros.length; i++) {
            System.out.println(zeros[i]);
            arr[i]=zeros[i];
        }


    }
}
