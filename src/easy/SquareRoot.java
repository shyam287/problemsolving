package easy;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(new SquareRoot().mySqrt(2147483647));
    }

    private int mySqrt(int x) {

        if(x == 1) {
            return 1;
        } else if (x == 0) {
            return 0;
        }

        return sqrt(x, 1, x/2);
    }

    private int sqrt(int x, int startNum, int endNum) {


        if(endNum < startNum) {
            return  startNum;
        }
        int mid = (startNum + endNum) /2;
        int midSqr = 0;
        int nextSqr = 0;

        try {
            midSqr = Math.multiplyExact(mid, mid);
            nextSqr = Math.multiplyExact(mid + 1, mid + 1);
        } catch(ArithmeticException e) {
            return sqrt(x, startNum, mid-1);
        }

        if(midSqr == x) {
            return mid;
        } else if (midSqr < x && nextSqr > x) {
            return mid;
        } else if (midSqr < x ) {
            return sqrt(x,mid+1, endNum);
        } else {
            return sqrt(x, startNum, mid-1);
        }
    }
}