package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {

            Integer count = map.get(nums[i]);

            if (count == null) {
               map.put(nums[i], 1);
            } else {
                count += 1;
                map.put(nums[i], count);
            }

            if(map.get(nums[i]) > 1) {
                return true;
            }
        }

        return false;
    }
}
