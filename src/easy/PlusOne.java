package easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {9,9};
        new PlusOne().plusOne(digits);
    }

    public int[] plusOne(int[] digits) {
        int[] resultArray = null;


        int carry = (digits[digits.length-1] + 1) / 10;
        digits[digits.length-1] = (digits[digits.length-1] + 1)%10;

        if(carry == 1) {

            for (int i = digits.length - 2; i >= 0; i--) {

                int incNum = digits[i] + carry;
                if (incNum > 9) {
                    digits[i] = incNum % 10;
                    carry = 1;
                } else {
                    digits[i] = incNum;
                    carry = 0;
                    break;
                }
            }

        }

        if(carry == 1) {
            resultArray = new int[digits.length+1];
            resultArray[0] = carry;

            copyDigitstoResult(resultArray, digits);
        } else {
            resultArray = digits;
        }

//        System.out.println(Arrays.asList(resultArray));
        return resultArray;
    }

    private void copyDigitstoResult(int[] resultArray, int[] digits) {

        for (int i=1, j=0; i < resultArray.length; i++, j++) {
            resultArray[i] = digits[j];
        }
    }
}
