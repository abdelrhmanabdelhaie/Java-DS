package DS.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //add
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    //ensureCapacity
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //get
    public E get(int index) {
        if (index > elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + elements.length);
        }
        return (E) elements[index];
    }

    public int size(){
        return elements.length;
    }
}
