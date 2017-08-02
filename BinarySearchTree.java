import java.util.*;
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }
    public void insert(int value){
        if(value<=data){
            if(left==null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else {
            if (right == null){
                right = new Node(value);
            } else{
                right.insert(value);
            }
        }
    }
    
    public boolean contains(int value) {
        if (value == data)return true;
        else if(value<data){
            if(left==null)return false;
            else return left.contains(value);
        } else{
            if(right==null)return false;
            else return right.contains(value);
        }
    }
    
    public void printInorder(){
        if(left!=null)left.printInorder();
        System.out.println(data);
        if(right!=null)right.printInorder();
    }
}

public class BinarySearchTree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Insert Head Element Value");
        Node head=new Node(sc.nextInt());
       do{
            System.out.println("Enter choice");
            c = sc.nextInt();
            switch(c){
                case 1 : System.out.println("Enter value to insert");
                         head.insert(sc.nextInt());
                         break;
                case 2 : System.out.println("Enter Elment to search");
                         head.insert(sc.nextInt());
                         break;
                case 3 : head.printInorder();
                         break;
                case 4 : System.exit(0);
                         break;
                default : System.exit(0);
            }
        } while(c<4);
    }
}
