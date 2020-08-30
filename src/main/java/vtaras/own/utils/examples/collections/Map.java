package vtaras.own.utils.examples.collections;

public interface Map {

    Long get(Integer key);

    int size();

    void put(Integer key, Long value);

    void remove(Integer key);
}
