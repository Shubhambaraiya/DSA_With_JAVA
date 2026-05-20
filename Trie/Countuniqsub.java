public class Countuniqsub {
    static class Node {
        Node[] Children;
        boolean endOfWords;

        public Node() {
            Children = new Node[26];
            for(int i = 0;i<26;i++){
                Children[i] = null;
            }
            endOfWords = false;
        }

    }
    static  Node root = new Node(); 
// Insertion in Trie
    public static void insert(String word){
        Node crr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(crr.Children[idx]==null){
                crr.Children[idx] = new Node();
            }
if(i==word.length()-1){
    crr.Children[idx].endOfWords = true;
}
            crr = crr.Children[idx];
        }
    }

public static boolean startWith(String prefix){
    Node crr = root;
    for(int i = 0;i<prefix.length();i++){
        int idx = prefix.charAt(i)-'a';
        if(crr.Children[idx]==null){
            return false;
        }
        crr = crr.Children[idx];
    }
    return true;
}
public static int countNode(Node root){
    if(root==null){
        return 0;
    }
    int count = 0;
    for(int i = 0;i<26;i++){
        if(root.Children[i]!=null){
        count+=countNode(root.Children[i]);
    }}
    return count+1;
}
    public static void main(String[] args) {
    
        String str = "ababa";
        for(int i = 0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
         System.out.println(countNode(root));
    
}}