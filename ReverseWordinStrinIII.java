class Solution {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse());

            if (w < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args){

	String s1 = "Let's take LeetCode contest";
        String s2 = "Mr Ding";

        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
    }
}

