public class Stack {
    private int size;
    private int items[];
    private int top;

    public Stack(int size) {
        this.size = size;
        items = new int[this.size];
        top = -1;
    }

    private boolean IsFull() {
        return top == size -1;
    }

    private boolean IsEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (IsFull()) {
            System.out.println("Стек заполнен");
        } else {
            System.out.println("Добавлен элемент " + element);
            items[++top] = element;
        }
    }

    public int pop() {
        int element;
        if (IsEmpty()) {
            System.out.println("Стек пустой");
            return -1;
        }
        element = items[top--];
        System.out.println("Удален элемент " + element);
        return element;
    }

    public int size() {
        return top +1;
    }

    public void Display() {
        int i;
        if (IsEmpty()) {
            System.out.println("Очередь пустая");
        } else {
            System.out.println("Элементы -> \n");
            for (i = top; i >= 0; i--) {
                System.out.println(items[i]);
            }
            System.out.println("\nИндекс TOP " + top);
        }
    }
    public static void main(String[] args) {
         Stack s = new Stack(5);
         s.pop();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         s.push(5);
         s.push(6);
         System.out.println(s.size());
         s.Display();
         s.pop();
         s.Display();
    }
}