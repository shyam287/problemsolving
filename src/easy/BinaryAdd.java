package easy;

public class BinaryAdd {

    public static void main(String[] args) {
        System.out.println(new BinaryAdd().addBinary("11", "1"));
    }

    private String addBinary(String a, String b) {

        String result = "";
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        int carry = 0;
        while(aIndex >=0 && bIndex >= 0) {

            if(a.charAt(aIndex) == '1' && b.charAt(bIndex) == '1' && carry == 0) {
                result = 0 + result;
                carry = 1;
            } else if (a.charAt(aIndex) == '1' && b.charAt(bIndex) == '1' && carry == 1) {
                result = 1 + result;
                carry = 1;
            } else if ((a.charAt(aIndex) == '1' || b.charAt(bIndex) == '1') && carry == 1) {
                result = 0 + result;
                carry = 1;
            } else if ((a.charAt(aIndex) == '1' || b.charAt(bIndex) == '1') && carry == 0) {
                result = 1 + result;
                carry = 0;
            } else if(carry == 1) {
                result = 1 + result;
                carry = 0;
            } else {
                result = 0 + result;
                carry = 0;
            }

            aIndex--;
            bIndex--;
        }

        while(aIndex >= 0) {

            if(carry == 1 && a.charAt(aIndex) == '1') {
                result = '0' + result;
                carry = 1;
            } else if(carry == 1 && a.charAt(aIndex) == '0') {
                result = '1' + result;
                carry = 0;
            } else {
                result = a.charAt(aIndex) + result;
            }
            aIndex--;
        }

        while (bIndex >= 0) {
            if(carry == 1 && b.charAt(bIndex) == '1') {
                result = '0' + result;
                carry = 1;
            } else if(carry == 1 && b.charAt(bIndex) == '0') {
                result = '1' + result;
                carry = 0;
            } else {
                result = b.charAt(bIndex) + result;
            }
            bIndex--;
        }

        return carry == 0 ? result : '1' +result;
    }
}
