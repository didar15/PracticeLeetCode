package LC3;

import java.util.Stack;

public class LC20_Valid_ParentheEZ {
    public static boolean isValid(String s) {
        if (s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //add opening item to stack ('(','{','[')
            if (s.charAt(i)=='(' ||s.charAt(i)=='{' ||s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
                ////validate if stack isnt empty then pop off respective string
            }else if (!stack.isEmpty() && s.charAt(i)==')' && stack.peek()=='(' ) {
                stack.pop();
            }else if (!stack.isEmpty() &&s.charAt(i)=='}' && stack.peek()=='{' ) {
                stack.pop();
            }else if (!stack.isEmpty() && s.charAt(i)==']' && stack.peek()=='[' ) {
                stack.pop();
            } else {
                return false;
            }
        }
        //after end of string there is nothing in stack then it is valid
       return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("["));
    }
}
