package medium;

public class LongestPalindrome {

    public static void main(String[] args) {

        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {

        int[][] state = new int[s.length()][s.length()];
        return longestPalindrome(s, 0, s.length()-1, state);
    }

    public String longestPalindrome(String s, int startIndex, int endIndex, int[][] state) {

        if(state[startIndex][endIndex] == 1)
        {
            return s.substring(startIndex, endIndex+1);
        }

        if(state[startIndex][endIndex] == -1) {
            return "";
        }

        int i = startIndex;
        int j = endIndex;

        if(i >= j) {
            return  s.substring(i, j+1);
        }

        boolean isPalindrome = true;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                state[startIndex][endIndex] = -1;
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome) {
            state[startIndex][endIndex] = 1;
            return  s.substring(startIndex, endIndex+1);
        }

        String s1 = longestPalindrome(s, startIndex+1, endIndex, state);
        String s2 = longestPalindrome(s, startIndex, endIndex-1, state);

        return s1.length() > s2.length() ? s1 : s2;
    }
}
