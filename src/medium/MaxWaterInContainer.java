package medium;

public class MaxWaterInContainer {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;

        int maxWater = 0;

        while (left < right) {

            int waterContained = (right - left) * Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, waterContained);

            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
