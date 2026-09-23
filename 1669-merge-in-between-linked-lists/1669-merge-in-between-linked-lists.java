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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ListNode temp1 = list1;
        while(temp1!=null){
            arr1.add(temp1.val);
            temp1 = temp1.next;
        }
        ListNode temp2 = list2;
        while(temp2!=null){
            arr2.add(temp2.val);
            temp2 = temp2.next;
        }

        for(int i=a;i<=b;i++){
            arr1.remove(a);
        }
        arr1.addAll(a,arr2);
       

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int val: arr1){
            curr.next = new ListNode(val);
            curr=curr.next;
        }
        return dummy.next;  
    }
}