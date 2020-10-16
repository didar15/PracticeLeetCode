package LC3;

import java.util.ArrayList;
import java.util.List;

public class LC22_Generate_ParenthesesMD {
    public static List<String> generateParenthesis(int n) {
        //input array
        List<String> result= new ArrayList<>();
        //add to backtracking
        backtack(result,"", 0,0, n);

        return result;

    }

    private static void backtack(List<String> result, String current_string, int open, int close, int max) {
        if (current_string.length() ==max*2) {
            //add to list once the string recursion reaches n*2 size
            result.add(current_string);
            return;
        }
        //Decisions
        //adding "(" as long as we didnt reach the end of the recusion
        if (open<max) {
            backtack(result, current_string+ "(", open+1, close,
                    max);
        }
        //only add ")" once we cannot add anymore ")" in each recusive call
        if (close<open) {
            backtack(result, current_string+ ")", open, close+1, max);
        }
    }


    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
