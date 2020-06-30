package vtaras.own.utils.examples.collections;

public class MyStack<T> {
    private T[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyStack() {
        elementData = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyStack(int index) {
        if (index > DEFAULT_CAPACITY) {
            elementData = (T[]) new Object[index];
        } else if (index < DEFAULT_CAPACITY && index >= 0) {
            elementData = (T[]) new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Incorrect argument: " + index);
        }
    }

    public T push(T t) {
        if (size == DEFAULT_CAPACITY) {
            T[] data = (T[]) new Object[size + 10];
            System.arraycopy(elementData, 0, data, 0, size);
            elementData = data;
        }
        elementData[size++] = t;
        return t;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Element does not exist");
        } else {
            System.arraycopy(elementData, index + 1, elementData, index, size - index);
            size--;
        }
    }

    void clear() {
        elementData = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return elementData[size - 1];
    }

    public T pop() {
        Object object = peek();
        remove(size - 1);
        return (T) object;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i]);
        }
    }
}
