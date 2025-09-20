public class TreeSumBst {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
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
        }
        return current;
    }
    static int findMin(Node root){
        if(root==null){
            return 0;
        }
            while (root.left != null) {
                root = root.left;
            }
            return root.data;
    }
    static int findMax(Node root){
    if(root==null){
        return 0;
    }
    while (root.right!=null) {
        root = root.right;
    }
    return root.data;
}

    public static int rangeSumBst(Node root, int min, int max){
        if(root==null){
            return 0;
        }
        int sum = 0;
        if (root.data >= min && root.data <= max) {
            sum += root.data;
        }
        if(root.data>min){
            sum+=rangeSumBst(root.left, min, max);
        }
        if(root.data<max){
            sum+=rangeSumBst(root.right, min, max);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        TreeSumBst tree = new TreeSumBst();
        tree.insert(4);
        tree.insert(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
       // tree.insert(18);

        int min = 7;
        int max = 15;

        int sum = rangeSumBst(tree.root, min, max);

        System.out.println("The sum of elements in the range [" + min + ", " + max + "] is: " + sum);   
        System.out.println(findMax(tree.root)-findMin(tree.root));
           
    }
}
