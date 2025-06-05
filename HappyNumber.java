import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int test1 = 19;
        int test2 = 2;

        System.out.println("Is " + test1 + " a happy number? " + isHappy(test1)); // true
        System.out.println("Is " + test2 + " a happy number? " + isHappy(test2)); // false
    }
}

