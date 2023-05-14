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
}