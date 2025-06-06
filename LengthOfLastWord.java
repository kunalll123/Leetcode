class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        
        // Find the last index of space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Length of last word = total length - index of last space - 1
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}

