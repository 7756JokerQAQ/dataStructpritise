package pri;


 //Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution10 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead=new ListNode();
        dummyHead.next=head;
        ListNode pre=head;
        int count=0;
        ListNode p=dummyHead;
        while(pre!=null){
            count++;
            pre=pre.next;
        }
        int sum=count-n;
        while(sum>0){
            p=p.next;
            sum--;
        }
        ListNode q=p.next;
        p.next=q.next;
        q.next=null;
        return dummyHead.next;
    }
}