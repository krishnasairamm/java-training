public class Treetraverse {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left = right = null;
        }
    }
    private Node root;
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+ " ");
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
    
    public static void main(String[] args) {
        Treetraverse tree = new Treetraverse();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);
        tree.root.left.left.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(100);

        System.out.println("Pre-order Traversal:");
        tree.preOrder(tree.root);
        System.out.println("\n");
 
        System.out.println("In-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\n");

        System.out.println("Post-order Traversal:");
        tree.postOrder(tree.root);
        System.out.println("\n");

        
    }
}
