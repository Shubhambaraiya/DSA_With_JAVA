import java.util.*;
public class SearchinBST {
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
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.Right);
    }
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.Right, key);
        }
    }

// public static Node delete(Node root,int val){
//     if(root.data>val){
//     root.left = delete(root.left, val);
//     }
//     else if(root.data<val){
//         root.Right = delete(root.Right, val);
//     }
//     else{

//         // Case 1.
//         if(root.left==null && root.Right==null){
//             return null;
//         }

//         // Case 2.
//         if(root.left==null){
//             return root.Right;
//         }
//         else if(root.Right==null){
//             return root.left;
//         }
//     // Case 3.
//     Node IS  = InorderSuccessor(root.Right);
//     root.data = IS.data;
//     root.Right = delete(root.Right, IS.data);
//     }
// return root;
// }
// public static Node InorderSuccessor(Node root){
//     while(root.left!=null){
//         root = root.left;
//     }
//     return root;
// }
public static void printNrange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        printNrange(root.left, x, y);
        System.out.print(root.data+" ");
        printNrange(root.Right, x, y);
    }
    else if(root.data>=y){
        printNrange(root.left, x, y);
    }
    else{
        printNrange(root.Right, x, y);
    }
}
public static void printPath(ArrayList<Integer>way){
    for(int i = 0;i<way.size();i++){
        System.out.print(way.get(i)+"->");
    }
    // System.out.print("null");
    System.out.println();
}

public static void printroottoleaf(Node root,ArrayList<Integer>path){
    if(root==null){
        return;
    }
  
    path.add(root.data);

      if(root.left==null && root.Right==null){
printPath(path);
    }
    else{
    printroottoleaf(root.left, path);
    printroottoleaf(root.Right, path);

    }
    path.remove(path.size()-1);
}
    public static void main(String[] args) {
        int arr[] = { 8,5,3,6,10,11,14};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        if (search(root, 3)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        // delete(root,1);

        Inorder(root);

// System.out.println();
        // printNrange(root, 6, 10);
        System.out.println();
        printroottoleaf(root, new ArrayList<>());
    }
}