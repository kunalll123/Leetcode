 class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // If we reach the end of a string or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]; // Entire first string is the common prefix
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(input);

        System.out.println("Longest Common Prefix: " + result);
    }
}

