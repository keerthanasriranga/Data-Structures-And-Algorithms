Node Delete(Node head, int position) {

     int i;
        Node current;
        current=head;
    if(position==0){
        head=head.next;
        return head;
    }
        for(i=0;i<position-1;i++){
            current=current.next;
        }
        Node ele=current.next;
        current.next=ele.next;
       return head;
        

}

/*Node Delete(Node head, int position) {
    if (position == 0){ return head.next; }
    head.next = Delete(head.next, position-1);
    return head;
}*/
