/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(current.next!=null){
            count++;
            current=current.next;
        }


        int middle = (int) Math.ceil((double)count/2);
        //obtained middle integer where the linked list is in half, and obtain the ceiling of it by casting float values to integers
        
        //we can't create listnode new object with the middle integer, instead we cud iterate through the list again until, but this time instead of going through the whole list, we can stop once we reached the middle value
        ListNode result = head;
        int i = 0;
        while(i<middle){
            i++;
            result=result.next;
        }
        
        return result;
    }
}