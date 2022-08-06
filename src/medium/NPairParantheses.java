package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NPairParantheses {

    public static void main(String args[]) {

    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        return result;
    }

    private List<String> generatePairParantheses( int n) {
        if(n <= 0) {
            return Collections.emptyList();
        }

        if(n == 1) {
            return Arrays.asList("()");
        }

        for(int i = n-1; i>=0; i--) {
            List<String> tempResult = generatePairParantheses(i);
            tempResult = addPrefixAndSuffix(tempResult);
        }

        return null;
    }

    private List<String> addPrefixAndSuffix(List<String> tempResult) {
        return tempResult.stream().map(result -> "("+result+")").collect(Collectors.toList());
    }

}
