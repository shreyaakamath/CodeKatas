package easy;

public class ReverseLL206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = head;
        ListNode current = head.next;
        head.next = null;
        while(current!=null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
