class SingleNumber {
	public static int checkSingleNum(int[] nums){

		int result =0;

		for(int i=0; i<nums.length; i++){

			result = result ^ nums[i];
		}

		return result;
	}

	public static void main(String[] args){

		int[] arr={2,2,1};
		System.out.println("Single Number is: " +checkSingleNum(arr));
	}
}
