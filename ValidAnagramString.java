 class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int freq : count) {
            if (freq != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println("Example 1: " + isAnagram(s1, t1)); // true
        System.out.println("Example 2: " + isAnagram(s2, t2)); // false
    }
}

