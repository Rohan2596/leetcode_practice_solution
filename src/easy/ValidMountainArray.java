package easy;

/**
 * *********************************
 * ****** Problem Statement ********
 * *********************************
 * <p>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * -------Example 1:----------
 * Input: arr = [2,1]
 * Output: false
 * <p>
 * ----- Example 2:-----------
 * Input: arr = [3,5,5]
 * Output: false
 * <p>
 * ----- Example 3:----------
 * Input: arr = [0,3,2,1]
 * Output: true
 * <p>
 * Constraints:
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 */

public class ValidMountainArray {
    public static void main(String[] args) {

        int[] arr = new int[]{0,5,5};

        int maxValue = arr[0];
        int position = 0;
        boolean UCondition = false;
        boolean LCondition = false;
        if (arr.length >= 3) {

           //finding max value with it position
            for (int i = 1; i < arr.length; i++) {
                if(maxValue<arr[i]){
                    maxValue= arr[i];
                    position=i;
                }
            }
            System.out.println(position);
            for (int i = 0; i < position; i++) {
                  if(arr[i]>=arr[i+1]){
                      UCondition=false;
                      break;
                  }
                  if(position==i){
                      break;
                  }
                  UCondition=true;
            }
            for (int i = position; i < arr.length-1; i++) {
                if(UCondition){
                if(arr[i]<=arr[i+1]){
                    LCondition=false;
                    break;
                }
                    LCondition=true;}
            }
        }
        System.out.println(UCondition && LCondition?true:false);
    }
}
