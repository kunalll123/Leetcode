 class Solution {

    // Function to find the index of first occurrence
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        // Loop through haystack with a sliding window of length equal to needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the starting index of the match
            }
        }

        return -1; // If no match found
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Output: " + solution.strStr(haystack1, needle1)); // Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Output: " + solution.strStr(haystack2, needle2)); // Output: -1
    }
}

