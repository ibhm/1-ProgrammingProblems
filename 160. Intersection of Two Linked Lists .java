/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lena = length(headA);
        int lenb = length(headB);
        
        //if length of A is bigger than B, then move head of A one poistion up. Then decrement A.
        while(lena>lenb){
            headA=headA.next;
            lena--;
        }
        //if length of B is bigger than A, then move head of B one poistion up. Then decrement b.        
        while(lenb>lena){
            headB=headB.next;
            lenb--;
        }
        //now both lists are are the same start point
        
        //move along each list until u find a node where headA = headB, this is your node 
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
    //find out lenght of a node, it moves a node along and increments counter until u reached the end of the string
    private int length(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}