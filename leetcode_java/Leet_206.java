// Define ListNode class
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Leet_206 {
    public static void main(String[] args) {
        /*
         * 206. Reverse linked list
         * Given the head of a singly linked list, reverse the list, and return the reversed list.
         * Input: head = [1,2,3,4,5]
         * Output: [5,4,3,2,1]
         */

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reversing the linked list
        ListNode reversedHead = reverseList(head);

        // Printing the reversed linked list
        printLinkedList(reversedHead);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
