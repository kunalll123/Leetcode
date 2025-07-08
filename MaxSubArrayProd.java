 class MaxProductSubarray {
    
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                // swap currMax and currMin when number is negative
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // Update currMax and currMin
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            // Update global maxProduct
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};

        System.out.println("Max Product of [2, 3, -2, 4]: " + maxProduct(nums1)); // Output: 6
        System.out.println("Max Product of [-2, 0, -1]: " + maxProduct(nums2));   // Output: 0
    }
}

