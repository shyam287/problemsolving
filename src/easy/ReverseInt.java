package easy;

public class ReverseInt {

    public static void main(String[] args) {
        new ReverseInt().reverse(1534236469);
        new ReverseInt().reverse(-123);
        new ReverseInt().reverse(120);
        new ReverseInt().reverse(0);
    }

    public int reverse(int x) {

        int reverseNum = 0;

        int prevReverseNum = 0;
        boolean isNegativeNum = false;

        if (x < 0) {
            isNegativeNum = true;
            x = -x;
        }

        while(x != 0) {

            int remainder = x%10;
            reverseNum = reverseNum*10 + remainder;
            if((reverseNum - remainder) / 10 != prevReverseNum ) {
                return 0;
            }
            prevReverseNum = reverseNum;
            x = x/10;
        }

//        System.out.println(reverseNum);
        return isNegativeNum ? -reverseNum : reverseNum;
    }
}
