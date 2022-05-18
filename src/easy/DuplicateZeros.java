package easy;

import java.util.Arrays;

/**
 * ****************************
 * ****Problem Statement*******
 * ****************************
 *
 * Given a fixed-length integer array arr,
 * duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 *
 * Note that elements beyond the
 * length of the original array are not written.
 * Do the above modifications to the input array in
 * place and do not return anything.
 *
 *
 *
 * Example 1:-----
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function,
 * the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:------
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function,
 * the input array is modified to: [1,2,3]
 *
 *
 * Constraints:
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 *
 * */


public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        int[] zeros= new int[arr.length];
        int length= arr.length;
        int k=0;
        for (int i = 0; i < length; i++) {
            if(arr[i]!=0){
                zeros[k]=arr[i];
                k++;
            }
            if(arr[i]==0){
                zeros[k]=arr[i];
                zeros[k++]=0;
                length--;
                k++;
            }

        }
        for (int i = 0; i < zeros.length; i++) {
            arr[i]=zeros[i];
        }
    }
}
