package easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public int climbStairs(int n) {
        return climbStairs(n, new HashMap<>());
    }
    
    public int climbStairs(int n, Map<Integer, Integer> map) {

        if(map.get(n) != null) {
            return  map.get(n);
        }

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        map.put(n, climbStairs(n-2, map) + climbStairs(n-1,map));

        return map.get(n);
    }
}
