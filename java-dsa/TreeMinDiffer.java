public class TreeMinDiffer {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    Node root;
     public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
        
            return current;
        }
        return current;
    }
    
    
    static int minDiff = Integer.MAX_VALUE;
    static Integer preval = null;

    
    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        
        // This is the processing step. We are at the current node.
        if(preval != null){
            minDiff = Math.min(minDiff, root.data - preval);
        }
        preval = root.data;
        
        inOrder(root.right);
    }

    static int getMinDifference(Node root){
        minDiff = Integer.MAX_VALUE;
        preval = null;
        inOrder(root);
        return minDiff;
    }
    
    public static void main(String[] args) {
        TreeMinDiffer tree = new TreeMinDiffer();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        
        System.out.println("The minimum difference is: " + getMinDifference(tree.root));
    }
}