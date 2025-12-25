import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLength=0;
        int n=s.length();

        HashSet<Character> set=new HashSet<>();

        while(right<n){
            char c=s.charAt(right);

            if(!set.contains(c)){
                set.add(c);
                maxLength = Math.max(maxLength,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
        
    }

    public static void main(String[] args){
	    String input="abcabcbb";

	    int result = lengthOfLongestSubstring(input);

	    System.out.println(result);
    }

}
