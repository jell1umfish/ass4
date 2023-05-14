import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashTable<K,V> {
    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private ArrayList<ArrayList<Node<K, V>>> buckets;
    private int size;
    public MyHashTable() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
    }
    public void put(K key, V value) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
        size++;
    }
    public V get(K key) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }
    public void remove(K key) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return;
            }
        }
    }
    public int size() {
        return size;
    }
    public void printBuckets() {
        for (int i = 0; i < buckets.size(); i++) {
            ArrayList<Node<K, V>> bucket = buckets.get(i);
            System.out.println( i + ": " + bucket.size());
        }
    }
}