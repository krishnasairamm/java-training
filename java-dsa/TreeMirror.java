public class TreeMirror {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    
    public void mirror(Node node) {
        if (node == null) {
            return;
        }
       
        mirror(node.left);
        mirror(node.right);
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    public static void main(String[] args) {

        TreeMirror tree = new TreeMirror();

        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        root.left.left.left = tree.new Node(8);
        root.left.left.right = tree.new Node(9);
        root.left.right.left = tree.new Node(10);
        
        System.out.println("Original Tree (In-order traversal):");
        tree.inOrder(root);
        System.out.println();
        
       // System.out.println("Mirroring the tree...");
        tree.mirror(root);
        System.out.println();
        
        System.out.println("Mirrored Tree (In-order traversal):");
        tree.inOrder(root);
        System.out.println();
    }
}