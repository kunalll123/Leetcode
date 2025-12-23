class  Solution {

	public static int findLongestofLCIS(int[] nums){

	int n=nums.length;

	if(n==0) return 0;

	int maxLen=1;
	int currLen=1;

	for(int i=1; i<n; i++){
		if(nums[i] > nums[i-1]){
			currLen++;
		}else{
			currLen = 1;
		}
		maxLen = Math.max(maxLen,currLen);
	}
	return maxLen;
	}

	public static void main(String[] args){

		int nums[] ={1,3,5,4,7};

		int ret = findLongestofLCIS(nums);
		System.out.println(ret);
	}
}
