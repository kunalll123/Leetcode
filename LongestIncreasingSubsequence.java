import java.util.*;

class Solution {

	//Using Dynamic Programming = O(n^2)

	public static int lengthofLIS(int[] nums){
		int n=nums.length;
		int[] dp=new int[n];

		Arrays.fill(dp,1);

		int maxLen=1;

		for(int i=1; i<n; i++){
			for(int j=0; j<i; j++){
				if(nums[j] < nums[i]){
					dp[i]=Math.max(maxLen,dp[j]+1);
				}
			}
			maxLen = Math.max(maxLen,dp[i]);
		}
		return maxLen;
	}

/*
	//Using Binary Search = O(n log n)
	
	public static int lengthofLIS(int[] nums){
		List<Integer> sub=new ArrayList<>();

		for(int num:nums){
			int idx=Collections.binarySearch(sub,num);
			if(idx<0)
				idx=-(idx+1);

			if(idx == sub.size()){
				sub.add(num);
			}else{
				sub.set(idx,num);
			}
		}
		return sub.size();
	}
*/
	public static void main(String[] args){

		int[] nums={10,9,2,5,3,7,101,18};

		int ret = lengthofLIS(nums);
		System.out.println(ret);
	}
}
