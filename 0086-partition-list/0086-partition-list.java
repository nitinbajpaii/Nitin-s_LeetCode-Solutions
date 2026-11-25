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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int a: arr){
            if(a<x){
                a1.add(a);
            }
            else{
                a2.add(a);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int a: a1){
            temp.next = new ListNode(a);
            temp=temp.next;
        }
        for(int a: a2){
            temp.next = new ListNode(a);
            temp=temp.next;
        }

        return dummy.next;
    }
}