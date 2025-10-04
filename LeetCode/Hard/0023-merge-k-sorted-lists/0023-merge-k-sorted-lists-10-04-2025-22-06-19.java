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
    public ListNode mergeKLists(ListNode[] lists) {
        boolean flag=false;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                flag=true;
                break;
            }
        }

        if(!flag )return null;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode current=lists[i];
            while(current!=null){
                arr.add(current.val);
                current=current.next;
            }
        }
        int[] array=new int[arr.size()];
        int i=0;
        for(int a:arr){
            array[i]=a;
            i++;
        }
        Arrays.sort(array);
        ListNode head=new ListNode(array[0]);
        ListNode current=head;
        for(int k=1;k<array.length;k++){
            current.next=new ListNode (array[k]);
            current=current.next;
        }
        return head;
    }
}