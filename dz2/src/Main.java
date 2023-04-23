public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> test = new MyLinkedList<>();
        test.addLast(1);
        test.addLast(3);
        test.addLast(6);
        test.addLast(9);
        test.addFirst(10);
        test.add(0,5);
        for (int i = 0; i < test.getSize(); i++) {
            System.out.println(test.get(i));
        }
    }
}