import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class CustomCopyOnWriteArrayList<T> {
    private volatile Object[] elements;
    private final ReentrantLock lock = new ReentrantLock();

    public CustomCopyOnWriteArrayList() {
        elements = new Object[0];
    }

    public void add(T element) {
        lock.lock();
        try {
            Object[] newElements = Arrays.copyOf(elements, elements.length + 1);
            newElements[newElements.length - 1] = element;
            elements = newElements;
        } finally {
            lock.unlock();
        }
    }

    public T get(int index) {
        if (index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        lock.lock();
        try {
            if (index >= elements.length || index < 0) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
            }
            Object[] newElements = new Object[elements.length - 1];
            System.arraycopy(elements, 0, newElements, 0, index);
            System.arraycopy(elements, index + 1, newElements, index, elements.length - index - 1);
            elements = newElements;
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        return elements.length;
    }
}
