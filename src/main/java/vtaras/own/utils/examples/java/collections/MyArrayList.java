package vtaras.own.utils.examples.java.collections;

public class MyArrayList<T> implements List<T> {
    private T[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public MyArrayList() {
        elementData = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int index) {
        if (index > DEFAULT_CAPACITY) {
            elementData = (T[]) new Object[index];
        } else if (index < DEFAULT_CAPACITY && index >= 0) {
            elementData = (T[]) new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Incorrect argument: " + index);
        }
    }

    @Override
    public void add(T t) {
        if (size == DEFAULT_CAPACITY) {
            T[] data = (T[]) new Object[size + 10];
            System.arraycopy(elementData, 0, data, 0, size);
            elementData = data;
        }
        elementData[size++] = t;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Element does not exist");
        } else {
            System.arraycopy(elementData, index + 1, elementData, index, size - index);
            size--;
        }
    }

    @Override
    public void clear() {
        elementData = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Element does not exist");
        } else {
            return elementData[index];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i]);
        }
    }
}
