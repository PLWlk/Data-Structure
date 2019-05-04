public class Solution2 {
    public ListNode removeElements(ListNode head,int val){

        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
//        while(head !=null && head.val == val)
//            head = head.next;
//
//        if (head == null)
//            return null;

        ListNode prev = dummyhead ;
        while(prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }
        return dummyhead.next;
    }

}
