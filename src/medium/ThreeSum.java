package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i< nums.length; i++) {

            if(i == 0 || nums[i] != nums[i-1]) {
                int target = nums[i] * (-1);
                int left = i+1;
                int right = nums.length -1;

                while(left < right) {
                    if( (i == left-1 || nums[left] != nums[left - 1]) && nums[left] + nums[right] == target) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}
