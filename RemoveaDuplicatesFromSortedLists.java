// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If list is empty or has only one element
        if (head == null || head.next == null) return head;

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }
}
class Main {
    public static void main(String[] args) {
        // Create input: [1,1,2,3,3]
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        // Print result
        System.out.print("Output: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

