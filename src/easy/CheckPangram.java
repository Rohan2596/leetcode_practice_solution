package easy;

/**
 * --------------------------------------
 * ------- Problem Statement -------
 * --------------------------------------
 * <p>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 * <p>
 * ---------Example 1:-------
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * <p>
 * -------- Example 2:--------
 * Input: sentence = "leetcode"
 * Output: false
 * <p>
 * -------- Constraints:--------
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */


public class CheckPangram {

    public static void main(String[] args) {
        String value = "thequickbrownfoxjumpsoverthelazydog";
        // positive look head (?= )
        //. atlest one charater
        //(.*) can be used a wild card match for any number (zero or more) of any characters.
        System.out.println(value.matches("^(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)" +
                "(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)" +
                "(?=.*w)(?=.*x)(?=.*y)(?=.*z).*$"));

    }

}
