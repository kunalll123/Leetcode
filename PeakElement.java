 Class FindPeakElement {

    // Function to find a peak element
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with mid + 1
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Peak is in left half (including mid)
            } else {
                left = mid + 1; // Peak is in right half
            }
        }

        // left == right at the end, and it's a peak
        return left;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        int peakIndex1 = findPeakElement(nums1);
        int peakIndex2 = findPeakElement(nums2);

        System.out.println("Peak index in nums1: " + peakIndex1 + " (Value: " + nums1[peakIndex1] + ")");
        System.out.println("Peak index in nums2: " + peakIndex2 + " (Value: " + nums2[peakIndex2] + ")");
    }
}

