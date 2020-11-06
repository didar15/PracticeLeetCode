package LC3;

public class LC328_Odd_Even_Linked_ListMD {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;//keep reference to the start of even list
        while (even != null && even.next != null) {
            odd.next = even.next;//links odd to next odd node
            odd = odd.next;//odd pointer (travese odd)
            even.next = odd.next;//links even to next even node
            even = even.next;//even pointer (traverse even)
        }
        odd.next = evenHead;//link odd to start of even list
        return head;//return the start of list
    }


    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
         l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        System.out.println(oddEvenList(l1));
    }
}
