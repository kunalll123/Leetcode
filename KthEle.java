import java.util.PriorityQueue;

 class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        // Min Heap to keep track of k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            // Keep only k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Kth largest element: " + findKthLargest(nums1, k1)); // Output: 5

        // Example 2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Kth largest element: " + findKthLargest(nums2, k2)); // Output: 4
    }
}

