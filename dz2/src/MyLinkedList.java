import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private int size;
    private Node first;
    private Node last;
    private class Node {
        E item;
        Node next;
        Node(E element) {
            this.item = element;
            this.next = null;
        }
        Node(E element, Node next) {
            this.item = element;
            this.next = next;
        }
    }
    MyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }
    private Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public E get(int index) {
        Node node = getNode(index);
        return node.item;
    }
    public E getFirst() {
        if (first == null) throw new NullPointerException();
        return first.item;
    }
   // public E getLast() {
    //    if (last == null) throw new NullPointerException();
     //   return last.item;
   // }
    public void addFirst(E element) {
        if (first == null) {
            Node node = new Node(element);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, first);
            first = node;
        }
        size++;
    }
    public void addLast(E element) {
        if (last == null) {
            Node node = new Node(element);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, null);
            last.next = node;
            last = node;
        }
        size++;
    }
    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node node = getNode(index);
            size++;
        }
    }
    public boolean remove(int index) {
        if (size == 1) {
            first = null;
            last = null;
        } else if (index == 0) {
            first = first.next;
        } else if (index == size - 1) {
        } else {
            Node node = getNode(index);
        }
        size--;
        return true;
    }
    public int getSize() {
        return size;
    }
}