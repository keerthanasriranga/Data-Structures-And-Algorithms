//A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
//function must return a boolean denoting whether or not there is a cycle in the list. 
//If there is a cycle, return true; otherwise, return false

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    ArrayList<Node> list = new ArrayList<Node>();
    if(head==null)return false;
    Node current  = head;
    while(current.next!=null){
        if(list.contains(current))return true;
        else list.add(current);
        if(current.next!=null)current=current.next;
    }
    return false;
}

/* Better solution
boolean hasCycle(Node head) {
    if (head == null) return false;
    
    Node slow = head;
    Node fast = head.next;
    while (slow != fast) {
        if (fast == null || fast.next == null) return false;
        
        slow = slow.next;
        fast = fast.next.next;
    }
    
    return true;
}
*/
