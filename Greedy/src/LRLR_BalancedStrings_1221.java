import java.util.Stack;

/**
 * leetcode: 1221. Split a String in Balanced Strings
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
 */

public class LRLR_BalancedStrings_1221 {

    public static int balancedStringSplit(String s) {
        int lCnt=0;
        int rCnt=0;
        int output=0;
        for(char c:s.toCharArray()){
            if(c=='L')
                lCnt++;
            if(c=='R')
                rCnt++;
            if(lCnt==rCnt){
                output++;
                lCnt = rCnt = 0;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input  = "RLLLLRRRLR";
        System.out.println(" : "+balancedStringSplit(input));
    }
}
