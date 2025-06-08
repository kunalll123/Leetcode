 class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        System.out.println("Reversed of " + x1 + " is: " + reverse(x1));
        System.out.println("Reversed of " + x2 + " is: " + reverse(x2));
        System.out.println("Reversed of " + x3 + " is: " + reverse(x3));
    }
}

