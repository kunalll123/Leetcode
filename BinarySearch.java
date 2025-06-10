import java.util.*;

class BinarySearch{
	int binarySearch(int nums[],int target){
		int start=0;
		int end=nums.length-1;

		while(start <= end){

			int mid=(start+end)/2;

			if(nums[mid]==target)
				return mid;

			if(nums[mid]<target)
				start=mid+1;

			if(nums[mid]>target)
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args){
		
		int nums[]=new int[]{4,7,11,24,35,57,75,86};

		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();

		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(nums,target);

		if(index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index: " + index);
	}
}
