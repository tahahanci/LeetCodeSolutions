package solutions;

public class ReverseInteger {

    public int reverse(int x) {
        long reverse = 0;
        int unsignedNumber = x < 0 ? -1 : 1;

        x = Math.abs(x);

        while(x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        reverse *= unsignedNumber;
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reverse;
    }
}
