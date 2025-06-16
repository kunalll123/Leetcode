// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Loop through both lists until one is empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node
                list1 = list1.next;    // Move list1 forward
            } else {
                current.next = list2;  // Attach list2 node
                list2 = list2.next;    // Move list2 forward
            }
            current = current.next;    // Move current forward
        }

        // At least one of the lists is now null, so attach the remaining list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;  // The merged list starts after the dummy node
    }
    
}
class Main {
    public static void main(String[] args) {
        // Creating first sorted linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Creating second sorted linked list: 1 -> 3 -> 5
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));

        Solution solution = new Solution();
        ListNode mergedHead = solution.mergeTwoLists(list1, list2);

        // Print merged linked list
        System.out.print("Merged List: ");
        while (mergedHead != null) {
            System.out.print(mergedHead.val + " ");
            mergedHead = mergedHead.next;
        }
    }
}

