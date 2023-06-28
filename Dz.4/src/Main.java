import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer> test = new MyTreeSet<>();
        TreeSet testSet = new TreeSet<>();
        testSet.add(12);
        testSet.remove(12);
        testSet.clear();
        testSet.contains(12);
    }
}