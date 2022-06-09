package easy;

/**
 * ----------------------------------------
 * -------- Problem Statement ---------
 * ----------------------------------------
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 * <p>
 * Given the string command, return the Goal Parser's interpretation of command.
 * <p>
 * Example 1:
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 * <p>
 * Example 2:
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 * <p>
 * Example 3:
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 * <p>
 * Constraints:
 * 1 <= command.length <= 100
 * command consists of "G", "()", and/or "(al)" in some order.
 */


public class GoalParserInterpretation {

    public static void main(String[] args) {

        String command = "(al)G(al)()()G";
        char[] chars = command.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') {
                stringBuilder.append('G');
            }
            if (chars[i] == '(') {
                if (chars[(i + 1)] == ')') {
                    stringBuilder.append('o');

                }
                if (chars[(i + 1)] == 'a') {
                    stringBuilder.append("al");
                }
            }

        }

        System.out.println(stringBuilder.toString());

    }
}
