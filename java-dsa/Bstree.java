public class Bstree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    private Node root;
    public void insert(int data){
         root = insertEl(root,data);
    }
    public Node insertEl(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insertEl(root.left, data);
        }else if (data>root.data){
            root.right = insertEl(root.right, data);
        }
        return root;
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public boolean search(int data){
        return searchEl(root, data);
    }
    public boolean searchEl(Node root, int data){
        if(root==null){
            return false;
        }
         if (root.data == data) {
            return true;
        }
        if(data<root.data){
            return searchEl(root.left, data);
        }else{
            return searchEl(root.right, data);
        }
    }

    // another way to implement search

    /* static Node searche(Node root,int data){
        if(root==null || root.data==data){
            return root;
        }
        if(data<root.data){
            return searche(root.left, data);
        }else{
            return searche(root.right, data);
        }
    } */

   public static Node delete(Node root, int data) {
        if (root == null) {
            return root; 
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            root.data = minVal(root.right);
             
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    public static int minVal(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }


    public static void main(String[] args) {
        Bstree bst = new Bstree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(9);
        bst.insert(19);

        System.out.println("Pre-order Traverse");
        bst.preOrder(bst.root);
        System.out.println("\n");

        System.out.println("In-order Traverse");
        bst.inOrder(bst.root);
        System.out.println("\n");

        System.out.println("Post-order Traverse");
        bst.postOrder(bst.root);
        System.out.println("\n");
        
        System.out.println(bst.search(10));
        /* Node notFoundNode = Bstree.searche(bst.root, 15);
        if (notFoundNode != null) {
             System.out.println("Node with data 15 found: " + notFoundNode.data);
        } else {
            System.out.println("Node not found.");
        } */ 

    }
} 