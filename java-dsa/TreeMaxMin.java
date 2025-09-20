public class TreeMaxMin {
    // Node class
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int data) {
        this.root = insertRec(this.root, data);
    }
    
    private Node insertRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRec(current.left, data);
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        }
        return current;
    }

    public Node findMin() {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public Node findMax() {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public static void main(String[] args) {
        TreeMaxMin tree = new TreeMaxMin();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        Node minNode = tree.findMin();
        if (minNode != null) {
            System.out.println("Minimum value in tree: " + minNode.data);
        }

        Node maxNode = tree.findMax();
        if (maxNode != null) {
            System.out.println("Maximum value in tree: " + maxNode.data);
        }
    }
} 