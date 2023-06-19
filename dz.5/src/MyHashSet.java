import HashMap.MyHashMap;

public class MyHashSet<E> {
    MyHashMap<E, Object> map = new MyHashMap<>();
    private final static Object PRESENT = new Object();

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    public boolean remove(E e) {
        return map.remove(e) == PRESENT;
    }

    public boolean contains(E e) {
        return map.containsKey(e);
    }

    public int size() {
        return map.size();
    }

    public static void main(String[] args) {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.add("One");
        mySet.add("Two");
        mySet.add("Three");
        mySet.add("Two");
        System.out.println(mySet.add("Four"));
        System.out.println(mySet.size());
        System.out.println(mySet.contains("Two"));
        System.out.println(mySet.remove("Two"));
        System.out.println(mySet.contains("Two"));
        System.out.println(mySet);
    }
}