package solutions;

public class PalindromeNumber {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;
        int copy = number;
        while (number > 0) {
            sum = sum * 10 + number % 10;
            number /= 10;
        }
        return sum == copy;
    }
}
