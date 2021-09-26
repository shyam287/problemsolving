package easy;

public class SingleNumber {

    public static void main(String[] args) {

    }

    //problem: given an Integer array, all the elements are occurring twice except one which is there only once.
    //find the single number.
    public int singleNumber(int[] nums) {

        int result = 0;
        for(int i=0; i< nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
