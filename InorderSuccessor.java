/*Complete the function below - When parent node is not there
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class InorderSuccessor
{
    Node succ;
    static Node min(Node root){
        while(root.left!=null)
            root=root.left;
        return root;
    } 
	public Node inorderSuccessor(Node root,Node k)
         {
          //add code here.
        if(root.data==k.data){
            if(root.right!=null)
                succ=min(root.right);
        }
        else{
            if(k.data<root.data){
                succ=root;
                inorderSuccessor(root.left,k);
            }
            else
                inorderSuccessor(root.right,k);
        }
        return succ;
         }
}

 /* When parent node is given
Node inOrderSuccessor(Node root, Node n) {
 
        // step 1 of the above algorithm
        if (n.right != null) {
            return minValue(n.right);
        }
 
        // step 2 of the above algorithm
        Node p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }
 
    /* Given a non-empty binary search tree, return the minimum data 
     value found in that tree. Note that the entire tree does not need
     to be searched. */
    Node minValue(Node node) {
        Node current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }*/
 

