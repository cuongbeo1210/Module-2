package trienkhaiphuongthucArray;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;

    public MyList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        data = (E[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        data[size - 1] = e;
    }

    public void add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            if (size - 1 - index >= 0) System.arraycopy(data, index, data, index + 1, size - 1 - index);
            data[index] = e;
        }
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<>(data.length);
        for (E x : data) {
            clone.add(x);
        }
        return clone;
    }

    public E[] getData() {
        return this.data;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(data, index + 1, data, index, size  - index);
            size -= 1;
        }
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (E x : data) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
