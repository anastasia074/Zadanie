public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> test = new MyTreeMap<>();
        test.put(100, "100");
        test.put(80, "80");
        test.put(130, "130");
        test.put(40, "40");
        test.put(90, "90");
        test.put(110, "110");
        test.put(170, "170");
        test.put(20, "20");
        test.put(60, "60");
        test.put(120, "120");
        test.put(140, "140");
        test.put(200, "200");
        test.put(10, "10");
        test.put(30, "30");
        test.put(50, "50");
        test.put(70, "70");
        test.put(5, "5");
        test.put(55, "55");
        test.remove(100);
        test.printTree();
    }
}