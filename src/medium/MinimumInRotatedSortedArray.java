package medium;

public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;

        if(nums[right] > nums[0]) {
            return nums[0];
        }

        while (left <= right) {

            int mid = (left+right)/2;
            if(nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }

            if(nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return 0;
    }
}
