package easy;
/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 *
 * */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s= "loveleetcode";

        char[] characters=s.toCharArray();
        for (int i = 0; i <characters.length ; i++) {
            boolean match=false;
            for (int j = 0; j < characters.length; j++) {
                if(i!=j){
                    if(characters[i]==characters[j]){
                        match=true;
                        break;
                    }
                }
            }
            if(!match){
                System.out.println(i);
                break;
            }
        }


    }
  
}
