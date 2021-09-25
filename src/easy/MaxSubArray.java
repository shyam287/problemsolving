package easy;

import java.util.Arrays;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        new MaxSubArray().maxSubArray(nums);

        int[]  nums1 = {1};
        new MaxSubArray().maxSubArray(nums1);
    }

    public int maxSubArray(int[] nums) {

        int currentMax = 0;
        int resultMax = -1;
        int largestNegativeNum = Integer.MIN_VALUE;

        if(nums.length == 1) {
            return nums[0];
        }

        for(int i=0;i < nums.length; i++) {

            currentMax += nums[i];

            if(resultMax < currentMax) {
                resultMax = currentMax;
            }

            if (currentMax < 0) {
                currentMax = 0;
            }

            if (nums[i] < 0 && nums[i] > largestNegativeNum) {
                largestNegativeNum = nums[i];
            }
        }

        return resultMax >=0 ? resultMax : largestNegativeNum;
    }
}
