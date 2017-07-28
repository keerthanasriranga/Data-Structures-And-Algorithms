 Node Insert(Node head,int data,int position){
 Node newNode = new Node();
    newNode.data = data;
    Node current = head;  
    
    if( position == 0 ){
        newNode.next = head;
        return newNode;
    }
    
    int counter = 0;
    while( ++counter < position ){
        current = current.next;
    }
        
    newNode.next = current.next;   
    current.next = newNode;   
    
    return head;
}

//using recursion:
//if (position == 0) {
//         Node node = new Node();
//         node.data = data;
//         node.next = head;
//         return node;
//     }
//     head.next = InsertNth(head.next, data, position - 1);
//     return head;
