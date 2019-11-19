/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
     
        ListNode curr = head;
        ListNode prev = null;
        ListNode swap = null;
        while(curr != null){
            if(swap == null && curr.val >= x){
                swap = prev;
                prev = curr;
                curr = curr.next;
                continue;
            }
            if(curr.val < x){
                if(prev != null){
                prev.next = curr.next;
                }else{
                    prev = curr;
                    //curr = curr.next;
                }
                
                if(swap != null){
                curr.next = swap.next;
                swap.next = curr;
                swap= curr;
                }
                if(prev != null)
                {
                    curr = prev.next;
                }
                
            }else{
                prev= curr;
                curr = curr.next;
            }
        }
        
        return head;
    }
}