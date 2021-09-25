package easy;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] num1 = {};
        int[] num2 = {};
        int m = 0;
        int n = 0;
        new MergeTwoSortedArray().merge(num1, m, num2, n);
        Arrays.stream(num1).forEach(System.out::println);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int currentIndex = m+n-1;

        while (currentIndex >=0 ) {

            if( i>=0 && j >=0 && nums1[i] > nums2[j]) {
                nums1[currentIndex] = nums1[i];
                i--;
            } else if( i>=0 && j >=0 && nums1[i] <= nums2[j]){
                nums1[currentIndex] = nums2[j];
                j--;
            } else if(i < 0) {
                nums1[currentIndex] = nums2[j];
                j--;
            } else if(j < 0) {
                nums1[currentIndex] = nums1[i];
                i--;
            }

            currentIndex--;

        }
    }



}
