 class MaxAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate sum of first 'k' elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initialize maxSum with the sum of the first window
        double maxSum = sum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];  // Slide the window
            maxSum = Math.max(maxSum, sum); // Track max sum
        }

        // Step 3: Return the maximum average
        return maxSum / k;
    }

    public static void main(String[] args) {
        MaxAverageSubarray obj = new MaxAverageSubarray();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println(obj.findMaxAverage(nums1, k1)); // Output: 12.75

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(obj.findMaxAverage(nums2, k2)); // Output: 5.0
    }
}

