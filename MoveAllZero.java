class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
            	nums[nonZeroIndex++]=nums[i];
        	}
        }
        while(nonZeroIndex < nums.length){
            nums[nonZeroIndex++]=0;
        }
        
    }

    public static void main(String[] args){

	    Solution obj=new Solution();

	    int[] arr={3,5,0,0,4};
	    obj.moveZeroes(arr);

	    

	    for(int num:arr){
		    System.out.print(num + " ");
	    }
	}
}
