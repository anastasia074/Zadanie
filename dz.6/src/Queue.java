public class Queue {
    int size;
    int item[];
    int front, rear;

    public Queue(int size) {
        this.size = size;
        item = new int[this.size];
        front = -1;
        rear = -1;
    }

    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftBorder + rightBorder) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    private boolean IsFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    public boolean IsEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public void EnQueue(int element) {
        if (IsFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            item[rear] = element;
            quickSort(item, front, rear);
            System.out.println("Добавлен элемент " + element);
        }
    }

    public int DeQueue() {
        ;
        int element;
        if (IsEmpty()) {
            System.out.println("Очередь пустая");
            return (-1);
        } else {
            element = item[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Удален элемент " + element);
            return element;
        }
    }

    public void Display() {
        int i;
        if (IsEmpty()) {
            System.out.println("Очередь пустая");
        } else {
            System.out.println("\nИндекс FRONT " + front);
            System.out.println("Элементы -> ");
            for (i = front; i <= rear; i++) {
                System.out.println(item[i] + " ");
            }
            System.out.println("\nИндекс REAR " + rear);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.DeQueue();
        q.EnQueue(4);
        q.EnQueue(1);
        q.EnQueue(3);
        q.EnQueue(2);
        q.EnQueue(5);
        q.EnQueue(6);
        q.Display();
        q.DeQueue();
        q.Display();
    }
}