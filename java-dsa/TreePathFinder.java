public class TreePathFinder {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public boolean findPath(int target, StringBuilder path) {
        return findPathRecursive(root, target, path);
    }

    private boolean findPathRecursive(Node node, int target, StringBuilder path) {
        if (node == null) {
            return false;
        }
      
        int initialLength = path.length();

       
        if (path.length() > 0) {
            path.append(" -> ");
        }
        path.append(node.data);

  
        if (node.data == target) {
            return true;
        }
  
        if (findPathRecursive(node.left, target, path) || findPathRecursive(node.right, target, path)) {
            return true;
        }
        path.delete(initialLength, path.length());
        
        return false;
    }

    public static void main(String[] args) {
        TreePathFinder tree = new TreePathFinder();
        tree.root = tree.new Node(10);
        tree.root.left = tree.new Node(5);
        tree.root.right = tree.new Node(15);
        tree.root.left.left = tree.new Node(3);
        tree.root.left.right = tree.new Node(7);
        tree.root.right.left = tree.new Node(12);
        tree.root.right.right = tree.new Node(18);

        StringBuilder path = new StringBuilder();
        int target = 7;
        
        if (tree.findPath(target, path)) {
            System.out.println("Path to " + target + ": " + path.toString());
        } else {
            System.out.println("Node " + target + " not found.");
        }
    }
}