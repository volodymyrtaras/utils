package vtaras.own.utils.examples.collections.impl;

import lombok.Getter;
import vtaras.own.utils.examples.collections.Map;

import java.util.Objects;

/**
 * Map for entries with key -> value of types Integer -> Long
 */
public class MyHashMap implements Map {

    private Node[] elements;
    private int size;

    private static final double LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;

    public MyHashMap() {
        elements = new Node[INITIAL_CAPACITY];
    }

    @Override
    public Long get(Integer key) {
        return elements[getIndex(key)] == null ? null : elements[getIndex(key)].getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Integer key, Long value) {

        if ((double) size / elements.length > LOAD_FACTOR) {
            resize();
        }

        if (elements[getIndex(key)] == null) {
            size++;
        }

        Node node = new Node(key, value);
        int index = getIndex(key);
        elements[index] = node;
    }

    @Override
    public void remove(Integer key) {
        elements[getIndex(key)] = null;
        size--;
    }

    private void resize() {
        Node[] resized = new Node[elements.length * 2];
        System.arraycopy(elements, 0, resized, 0, elements.length);
        elements = resized;
    }

    private int getIndex(Integer key) {
        return Objects.hash(key) & (elements.length - 1);
    }

    @Getter
    static class Node {

        Integer key;
        Long value;

        Node(Integer key, Long value) {
            this.key = key;
            this.value = value;
        }
    }
}
