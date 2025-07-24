/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode ans=result;
        while(result!=null){
            while(result.next!=null && result.next.val==val){
                result.next=result.next.next;
            }result=result.next;

        }
        return ans.next;
    }
}