import java.util.*;

public class base {

    static class HashMap<k, v> {

        public class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        public int n;
        public int N;
        public LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")

        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        public int hashfunciton(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        public int searchLL(k key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unckecked")

        public void rehash() {
            LinkedList<Node> oldbucket[] = bucket;
            bucket = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                bucket[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(k key, v value) {
            int bi = hashfunciton(key);
            int di = searchLL(key, bi);
            if (di == -1) {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            else {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            double lemda = (double) n / N;
            if (lemda > 2.0) {
                rehash();
            }}
            public boolean containsearch(k key){
                int bi =  hashfunciton(key);
                int di = searchLL(key, bi);
                if(di==-1){
                    return false;
                }
                else{
                    return true;
                }
            }
            public  v remove(k key){
                int bi = hashfunciton(key);
                int di = searchLL(key, bi);
                if(di==-1){
                    return null;
                }
                else{
                    n--;
                    Node node = bucket[bi].remove(di);
                    return node.value;
                }

            }
            public v get(k key){
                int bi = hashfunciton(key);

                int di = searchLL(key, bi);
                if(di==-1){
                    return null;
                }
                else{
                    Node node = bucket[bi].get(di);
                    return node.value;
                }
            }
            public ArrayList<k>keySet(){
                ArrayList<k>keys = new ArrayList<>();
                for(int i = 0;i<bucket.length;i++){
                    LinkedList<Node>ll = bucket[i];
                    for(int j = 0;j<ll.size();j++){
                        Node node = ll.get(j);
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            public boolean isEmpty(){
                return n==0;
            }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bharat", 140);
        map.put("Island", 40);
        map.put("China", 1100);


        ArrayList<String>keys = map.keySet();
        for(int i = 0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("Bharat");
        System.out.println(map.get("Bharat"));
        map.put("India",140);
        ArrayList<String>chabi = map.keySet();
        for(int i = 0;i<keys.size();i++){
            System.out.println(chabi.get(i)+" "+map.get(chabi.get(i)));
        }