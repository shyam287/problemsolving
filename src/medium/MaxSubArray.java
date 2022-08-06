package medium;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int maxSum = 0;

        for(int i=0; i<nums.length; i++) {
            maxSum += nums[i];
        }

        while(left < right) {
            if (nums[left] <= nums[right]) {
                maxSum = maxSum - nums[left] > maxSum ? maxSum - nums[left] : maxSum;
                left++;

            } else {
                maxSum = maxSum - nums[right] > maxSum ? maxSum - nums[right] : maxSum;
                right--;
            }
        }

        return maxSum;
    }
}
