package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int index1=0;
        int index2=0;

        for(int i=0; i< nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null) {
                index1 = index;
                index2 = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{index1, index2};
    }
}
