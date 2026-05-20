public class Basic {
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
    // Searching in trie
    public static boolean Search(String key){
        Node crr = root;
        for(int i = 0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            Node node = crr.Children[idx];
            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.endOfWords==false){
                return false;
            }
            crr = crr.Children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(Search("there"));
        System.out.println(Search("their"));
        System.out.println(Search("thor"));

    }
    
}
