
 class MaxCircularDiff {
    public static int maxDiff(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int nextIndex = (i + 1) % n;  // circular next
            int diff = Math.abs(nums[i] - nums[nextIndex]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4};
        System.out.println(maxDiff(nums1)); // Output: 3

        int[] nums2 = {-5, -10, -5};
        System.out.println(maxDiff(nums2)); // Output: 5
    }
}

