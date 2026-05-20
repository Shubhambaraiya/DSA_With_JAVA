
import java.util.*;

public class revision {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =  null;
        }
    }
    public static class BinaryTree{
        static int idx = -1;
        public  Node builTree(int node[]){
idx++;
if(node[idx]==-1){
    return null;
}
Node newNode = new Node(node[idx]);
newNode.left = builTree(node);
newNode.right = builTree(node);

return newNode;
        }

        public  void preOrder(Node root){
if(root==null){
    return ;
}
System.out.print(root.data+" ");
preOrder(root.left);
preOrder(root.right);
        }

        public  void inOrder(Node root){
            if(root==null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public  void postOrder(Node root){
            if(root ==null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }
        public  void levelOrder(Node root){

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node crrNode = q.remove();
            if(crrNode==null){
                System.out.println();
            if(q.isEmpty()){
                break;
            }
        else{
            q.add(null);
        }}
            else{
                System.out.print(crrNode.data+" ");
                if(crrNode.left!=null){
                    q.add(crrNode.left);
                }
                if(crrNode.right!=null){
                    q.add(crrNode.right);
                }
            }
        }
    }
    public int countOfNode(Node root){
if(root==null){
    return 0;
}
int lefetNode = countOfNode(root.left);
int rightNode = countOfNode(root.right);

return lefetNode+rightNode+1;

    }
    }
    public static void main(String []args){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(arr);
        System.out.println(root.data);
        // tree.preOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);

        System.out.println(tree.countOfNode(root));

    }
}
