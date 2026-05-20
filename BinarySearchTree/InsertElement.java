public class InsertElement {
    static class Node {
        int data;
        Node left;
        Node Right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.Right = insert(root.Right, val);
        }
        return root;
    }
public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
if(root.data>key){
    return search(root.left, key);
}
else if(root.data==key){
    return true;
}
else{
    return search(root.Right, key);
}
}
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

Inorder(root);
System.out.println();
if(search(root, 1)){
System.out.println("Found");
}
else{
    System.out.println("Not Found");
}
    }
}
