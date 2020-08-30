package easy;

public class MergeSortedList21 {
    /*
   Cases to handle:
   [1,2,4]
   [3,5,6]

   [1,2,4,6]
   [2]

   []
   [1,2,3]

   [1,2,3]
   []

   []
   []

   Time: O(n)
   Space: O(1)

   */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;

        while(l1!=null && l2!=null){
            ListNode next = null;

            if(l1.val <= l2.val) {next = l1;l1=l1.next;}
            else {next=l2;l2=l2.next;}

            if(head==null) {head=next;tail=next;}
            else {tail.next=next;tail=tail.next;}

        }

        if(l1!=null) {
            if(head==null) {head=l1;tail=l1;}
            else tail.next=l1;
        }

        if(l2!=null) {
            if(head==null) {head=l2;tail=l2;}
            else tail.next=l2;
        }

        return head;

    }
}
