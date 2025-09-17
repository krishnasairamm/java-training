public class TreeSize {
// this code has size and level
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public static int getLevel(Node root, int level, int target) {
        if (root == null) {
            return -1;
        }
        if (root.data == target) {
            return level;
        }
        int leftLevel = getLevel(root.left, level + 1, target);
        if (leftLevel != -1) {
            return leftLevel;
        }
        

        return getLevel(root.right, level + 1, target);
    }

    public static void main(String[] args) {


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
       
        System.out.println("Size of tree is " + size(root));
        
        
        System.out.println("Level of node 2 is " + getLevel(root, 0, 2));

    
        System.out.println("Level of node 10 is " + getLevel(root, 0, 10));
    }
}