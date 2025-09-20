/* public class TreeIsValid {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static boolean isValid(Node root){
        return validate(root,  Long MAX_VALUE, Long MIN_VALUE);
    }
    static void validate(Node root,  Long MAX_VALUE, Long MIN_VALUE){
        if(root==null){
            return ;
        }
        if(node.data<=min)
    }
}
 */
public class TreeIsValid {
    
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    
    public static boolean isValid(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(Node node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.data <= min || node.data >= max) {
            return false;
        }
        return validate(node.left, min, node.data) && validate(node.right, node.data, max);
    }

    public static void main(String[] args) {
        // Example 1: A valid BST
        Node validRoot = new Node(10);
        validRoot.left = new Node(5);
        validRoot.right = new Node(15);
        validRoot.left.left = new Node(3);
        validRoot.left.right = new Node(7);
        validRoot.right.left = new Node(12);
        validRoot.right.right = new Node(18);
        
        System.out.println("Is the first tree a valid BST? " + isValid(validRoot)); // Expected: true
        
        // Example 2: An invalid BST
        Node invalidRoot = new Node(20);
        invalidRoot.left = new Node(10);
        invalidRoot.right = new Node(30);
        invalidRoot.left.right = new Node(25); // Invalid node (25 is in the left subtree of 20)
        
        System.out.println("Is the second tree a valid BST? " + isValid(invalidRoot)); // Expected: false
    }
}