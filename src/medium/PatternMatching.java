package medium;

public class PatternMatching {

    public boolean isMatch(String s, String p) {

        if(s.length() == 0 && "*".equals(p)) {
            return true;
        }

        if(s.length() == 0 && p.length() == 0) {
            return true;
        }

        if(s.length() > 0 && p.length() == 0) {
            return false;
        }

        if(s.length() == 0 && p.length() > 0) {
            return false;
        }

        if(s.charAt(0) == p.charAt(0)) {
            return isMatch(s.substring(1), p.substring(1));
        }

        if(p.charAt(0) == '.') {
            return isMatch(s.substring(1), p.substring(1));
        }

        if(p.charAt(0) == '*') {
            return isMatch(s.substring(1), p);
        }

        return false;
    }
}
