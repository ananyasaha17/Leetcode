class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = head;
        ListNode b = head;
        ListNode c;
        
        for(int i=1;i<k;i++){
            a = a.next;
        }
        c=a;
        a=a.next;
        while(a!=null){
            a=a.next;
            b=b.next;
        }
        
        int temp = c.val;
        c.val=b.val;
        b.val=temp;
        return head;
    }
}