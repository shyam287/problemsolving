package medium;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {

    //longest substring without repeating characters.
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int max = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        while (rightPointer < s.length()) {

            if (!set.contains(s.charAt(rightPointer))) {

                set.add(s.charAt(rightPointer));
                rightPointer++;

                max = set.size() > max ? set.size() : max;

            } else {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return max;
    }
}
