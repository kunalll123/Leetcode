import java.util.*;

class Solution {

	public static int longestStringChain(String[] words){

		Arrays.sort(words,(a,b)->a.length()-b.length());

		Map<String,Integer> dp=new HashMap<>();

		int maxLen=1;

		for(String word:words){
			int best =1;

			for(int i=0; i<word.length(); i++){
				String prev = word.substring(0,i)+word.substring(i+1);

				if(dp.containsKey(prev)){
					best = Math.max(best,dp.get(prev)+1);

				}
			}
			dp.put(word,best);
			maxLen = Math.max(maxLen,best);
		}
		return maxLen;
	}

	public static void main(String[] args){

		String[] words={"a","b","ba","bca","bda","bdca"};

		int ret = longestStringChain(words);
		System.out.println(ret);
	}
}
