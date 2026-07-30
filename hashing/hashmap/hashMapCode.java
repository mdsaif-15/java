import java.util.*;

public class hashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i; // di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBucket = buckets;

            N = N * 2;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBucket.length; i++) {
                for (Node node : oldBucket[i]) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di == -1

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;

            } else { // key exists
                Node data = buckets[bi].get(di);
                data.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }

        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 190);
        map.put("china", 200);
        map.put("us", 50);
    }
}