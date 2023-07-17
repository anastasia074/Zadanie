import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer> test = new MyTreeSet<>();
        test.contains(2);
        test.add(12);
        test.add(14);
        test.add(17);
        test.remove(12);
        test.printTreeSet();
    }
}