import java.util.*;

public class Hashmap {

    static class HashMap<k, v> {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }   

        private int n; // n->nodes
        private int N; // N->buckets/index
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")

        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashfunciton(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchinLL(k key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void rehash() {
            LinkedList<Node> oldbucket[] = bucket;
            bucket = new LinkedList[N*2];
            for (int i = 0; i < N*2; i++) {
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
            int di = searchinLL(key, bi);

            if (di == -1) {

                bucket[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bucket[bi].get(di);
                node.value = value;
            }

            double lemda = (double) n / N;
            if (lemda > 2.0) {
                rehash();

            }
        }

        public boolean containserch(k key) {
            int bi = hashfunciton(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return false;
            } else {
                return true;
            }

        }

        public v remove(k key) {
            int bi = hashfunciton(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                n--;
                Node node = bucket[bi].remove(di);
                return node.value;
            }

        }

        public v get(k key) {
            int bi = hashfunciton(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<k> keySet() {
            ArrayList<k> keys = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("China", 120);
        map.put("Bharat", 150);
        map.put("SriLanka", 20);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
map.remove("Bharat");
System.out.println(map.get("Bharat"));
map.containserch("Bharat");
System.out.println(map.get("Bharat"));
    }
}