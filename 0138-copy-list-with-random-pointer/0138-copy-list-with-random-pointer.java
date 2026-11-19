/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        List<Node> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        Node dummy = new Node(0);
        Node curr = dummy;
        HashMap<Node,Node> map = new HashMap<>();
        for(Node x: arr){
            curr.next = new Node(x.val);
            curr=curr.next;
            map.put(x,curr);
        }
        for(Node x: arr){
            map.get(x).random = map.get(x.random);
        }
        return dummy.next;  
    }
}