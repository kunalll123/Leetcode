 class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        // Loop through both strings from end to start
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);  // Add the last digit of sum
            carry = sum / 10;         // Carry forward

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));   // Output: 134
        System.out.println(addStrings("456", "77"));   // Output: 533
        System.out.println(addStrings("0", "0"));      // Output: 0
    }
}

