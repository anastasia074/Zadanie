package HashMap;

public class MyHashMap<x, y> {
    private MapBucket[] bucket;
    private int CAPACITY = 10;
    private int size = 0;

    public MyHashMap() {
        this.bucket = new MapBucket[CAPACITY];
    }

    public int size() {
        return size;
    }

    private getHash(K key) {
        return key.hashCode() & (CAPACITY - 1);
    }

    private KeyValue getEntry(K key){
        int hash = getHash(key);
        for (int i = 0; i < bucket[hash].getEntries().size(); i++) {
            KeyValue MyKeyValue = bucket[hash].getEntries().get(i);
            if (MyKeyValue.getKey().equals(key)) {
                return MyKeyValue;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        return !(Object.isNull(bucket[hash]) || Object.isNull(getEntry(key)));
    }

    public V put(K key, V value) {
        if (containsKey(key)) {
            KeyValue entry = getEntry(key);
            V temp = (V) entry.getValue();
            entry.setValue(value);
            return temp;
        } else {
            int hash = getHash(key);
            if (bucket[hash] == null) {
                bucket[hash] = new MapBucket();
            }
            bucket[hash].addEntry(new KeyValue()<>(key, value));
            size++;
        }
        return null;
    }

    public V get(K Key) {
        return containsKey(key) ? (V) getEntry(key).getValue() : null;
    }

    public V remove(K key) {
        if (containsKey(key)) {
            V temp = get(key);
            int hash = getHash(key);
            bucket[hash].removeEntry(getEntry(key));
            size--;
            return temp;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashSet = new MyHashMap<>();
        myHashSet.put(1, "One");
        myHashSet.put(2, "Two");
        myHashSet.put(3, "Three");
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.get(1));
        System.out.println(myHashSet.remove(1));
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.get(1));
        System.out.println(myHashSet.containsKey(1));
        System.out.println(myHashSet.containsKey(2));
        System.out.println(myHashSet.put(1, "One"));
        System.out.println(myHashSet.put(2, "Two"));
    }
}
