 class Solution {

	  public boolean isPalindrome(String s) {
        // Step 1: Remove all non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the string
        String reversed = new StringBuilder(s).reverse().toString();

        // Step 3: Compare the cleaned string with its reverse
        return s.equals(reversed);
    }

/*    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters case-insensitively
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
*/
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println("\"" + s1 + "\" -> " + solution.isPalindrome(s1)); // true
        System.out.println("\"" + s2 + "\" -> " + solution.isPalindrome(s2)); // false
        System.out.println("\"" + s3 + "\" -> " + solution.isPalindrome(s3)); // true
    }
}


