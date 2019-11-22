package vtaras.own.utils.examples.java.collections;

public class MyLinkedList<T> implements List<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        first = new Node<>(null, null, null);
        last = first;
        size = 0;
    }

    @Override
    public void add(T t) {
        Node<T> node = new Node<>(t, last, null);
        if (size == 0) {
            first = node;
        }
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        Node<T> node = getNode(index);
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Element does not exist");
        } else {
            remove(node);
        }
    }

    private void remove(Node<T> node) {
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        if (prev.data == null) {
            first = node.next;
        } else if (next == null) {
            last = node.prev;
        } else {
            prev.next = next;
            next.prev = prev;
            node.next = null;
            node.prev = null;
        }
        node.data = null;
        size--;
    }

    @Override
    public void clear() {
        Node node;
        for (Node i = first; i != null; i = node) {
            node = i.next;
            i.data = null;
            i.next = null;
            i.prev = null;
        }
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Element does not exist");
        } else {
            return getNode(index).data;
        }
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Element does not exist");
        } else if (index < size / 2) {
            Node<T> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<T> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    public void print() {
        Node<T> print = first;
        for (int i = 0; i < size; i++) {
            System.out.println(print.data);
            print = print.next;
        }
    }

    private static class Node<T> {
        public T data;
        public Node<T> prev;
        public Node<T> next;
        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
