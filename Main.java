import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, Integer> table = new MyHashTable<>();
        Integer value = 1;
        Integer key = 0;
        for (int i = 0; i < 5; i++) {
            table.put(i, value+i);
        }
        Integer[] getvalue = new Integer[table.size()];
        MyHashTable<Integer, Integer> defence_table = new MyHashTable<>();
        for(int as = 0; as<table.size(); as++){
            getvalue[as] = table.get(as);
        }
        for(int j = 0; j<5; j++){
            defence_table.put(j, getvalue[j]);
        }
        for(int a = 0; a<defence_table.size(); a++){
            System.out.println(defence_table.get(a));
        }

    }
}