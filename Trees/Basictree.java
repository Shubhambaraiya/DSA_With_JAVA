import java.util.*;

public class Basictree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        static int idx = -1;

        // Root Value
        public static Node builTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);

            return newNode;

        }
    }
    // Preorder Traversal

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Postorder Traversal
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal
    public static void orderLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node crr = q.remove();
            if (crr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(crr.data + " ");
                if (crr.left != null) {
                    q.add(crr.left);
                }
                if (crr.right != null) {
                    q.add(crr.right);
                }
            }
        }
    }

    // Count the no. of Node
    public static int coutnNode(Node root) {
        if (root == null) {
            return 0;
        }
        int left = coutnNode(root.left);
        int right = coutnNode(root.right);

        return left + right + 1;

    }

    // Count the Sum of The Node
    public static int sumOfCount(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfCount(root.left);
        int right = sumOfCount(root.right);

        return left + right + root.data;

    }

    // Height of the Tree
    public static int HeightofTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = HeightofTree(root.left);
        int righttHeight = HeightofTree(root.right);

        int Height = Math.max(leftHeight, righttHeight) + 1;

        return Height;

    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myhieght = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;

        int diam3 = left.ht + right.ht + 1;

        int mydiame = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myhieght, mydiame);
        return myInfo;
    }

    // }

    // public static int diameter( root){
    // if(root==null){
    // return 0;
    // }
    // int dia1 = diameter(root.left);
    // int dia2 = diameter(root.right);
    // int dia3 = HeightofTree(root.left)+HeightofTree(root.right)+1;

    // return Math.max(dia3,Math.max(dia2, dia3));
    // }
    public static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null) {
            return false;
        }
        if (root.data == subroot.data) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    public static boolean isSubTree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return (isSubTree(root.left, subroot) || isSubTree(root.right, subroot));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BT tree = new BT();
        Node root = tree.builTree(arr);
        // System.out.println(root.data + " ");
        // preorder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // orderLevel(root);
        int ans = coutnNode(root);
        System.out.println(ans);

        int sum = sumOfCount(root);
        System.out.println(sum);
        // System.out.println();
        // System.out.println(HeightofTree(root));

        // // int di = diameter(root);
        // // System.out.println(di);

        // System.out.println(diameter2(root).diam);

    }
}