 class SearchRotatedArray {

    // Function to search in rotated sorted array
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;

        int[] nums3 = {1};
        int target3 = 0;

        System.out.println("Index of " + target1 + ": " + search(nums1, target1)); // Output: 4
        System.out.println("Index of " + target2 + ": " + search(nums2, target2)); // Output: -1
        System.out.println("Index of " + target3 + ": " + search(nums3, target3)); // Output: -1
    }
}

