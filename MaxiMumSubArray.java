class MaxSumArray {
	public static int maxSum(int nums[]){

		int sum=0;
		int maxSum=Integer.MIN_VALUE;

		for(int i=0; i<nums.length; i++){
			sum=sum+nums[i];
			if(sum > maxSum)
				maxSum=sum;

			if(sum < 0)
				sum=0;
		}
		return maxSum;
	}
	public static void main(String[] args){

		
		int nums[]={-2,1,-3,4,-1,2,1,-5,4};

		int retVal=maxSum(nums);
		System.out.println ("Maximum SubArray is: " +retVal);
	}
}
