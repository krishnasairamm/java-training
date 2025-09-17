public class TreeDegree {
    static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public static int getDegree(Node root){
    if(root==null){
        return 0;
    }
    int degree=0;
    if(root.left!=null){
        degree++;
    }
    if(root.right!=null){
        degree++;
    }
    return  degree;
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
        System.out.println(root.left.data);
        System.out.println("Degree of Node 1 is "+getDegree(root));
        System.out.println("Degree of Node 4 is "+getDegree(root.left.left));
        System.out.println("Degree of Node 5 is "+getDegree(root.left.right));
        System.out.println("Degree of Node 10 is "+getDegree(root.left.right.left));
    }
}
