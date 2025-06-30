import java.util.Arrays;

 class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and process carry if needed
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Just increment and return
                return digits;
            }
            digits[i] = 0; // Set to 0 and continue to carry
        }

        // If we reach here, all digits were 9, e.g. 999 -> 1000
        int[] result = new int[n + 1];
        result[0] = 1; // First digit is 1, rest are already 0
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] digits1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(digits1));
        System.out.println("Output: " + Arrays.toString(plusOne(digits1)));

        // Test Case 2
        int[] digits2 = {4, 3, 2, 1};
        System.out.println("Input: " + Arrays.toString(digits2));
        System.out.println("Output: " + Arrays.toString(plusOne(digits2)));

        // Test Case 3
        int[] digits3 = {9};
        System.out.println("Input: " + Arrays.toString(digits3));
        System.out.println("Output: " + Arrays.toString(plusOne(digits3)));

        // Test Case 4 (All 9s)
        int[] digits4 = {9, 9, 9};
        System.out.println("Input: " + Arrays.toString(digits4));
        System.out.println("Output: " + Arrays.toString(plusOne(digits4)));
    }
}

