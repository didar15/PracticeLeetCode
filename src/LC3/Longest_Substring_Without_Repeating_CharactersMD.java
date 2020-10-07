package LC3;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_CharactersMD {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        //sliding window
        int start_pointer=0;
        int end_pointer=0;
        int max=0;

        while (end_pointer<s.length()){
            if (!set.contains(s.charAt(end_pointer))) {//if char does not exist we add it to set
                // and increase end pointer to the right(increase max size)
                set.add(s.charAt(end_pointer));//add char at that index of pointer
                end_pointer++;
                max=Math.max(set.size(),max); //compare new length vs previous max
            }else {//if we get a repeated char we remove that char
                // and increase start pointer up one thus reducing max size
                set.remove(s.charAt(start_pointer));
                start_pointer++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
