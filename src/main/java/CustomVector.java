import java.util.Arrays;

public class CustomVector<T> {
    private Object[] elements;
    private int size;
    private int capacityIncrement;

    public CustomVector(int initialCapacity, int capacityIncrement) {
        elements = new Object[initialCapacity];
        size = 0;
        this.capacityIncrement = capacityIncrement;
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length + capacityIncrement);
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T oldValue = (T) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    public int size() {
        return size;
    }
}
