import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomCopyOnWriteArrayListTest {

    @Test
    void addElementIncreasesSize() {
        CustomCopyOnWriteArrayList<String> list = new CustomCopyOnWriteArrayList<>();
        list.add("element");
        assertEquals(1, list.size());
    }

    @Test
    void getElementByIndex() {
        CustomCopyOnWriteArrayList<String> list = new CustomCopyOnWriteArrayList<>();
        list.add("element");
        assertEquals("element", list.get(0));
    }

    @Test
    void getElementByInvalidIndexThrowsException() {
        CustomCopyOnWriteArrayList<String> list = new CustomCopyOnWriteArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void removeElementByIndex() {
        CustomCopyOnWriteArrayList<String> list = new CustomCopyOnWriteArrayList<>();
        list.add("element");
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    void removeElementByInvalidIndexThrowsException() {
        CustomCopyOnWriteArrayList<String> list = new CustomCopyOnWriteArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void addElementBeyondInitialCapacity() {
        CustomCopyOnWriteArrayList<Integer> list = new CustomCopyOnWriteArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        assertEquals(11, list.size());
        assertEquals(10, list.get(10));
    }
}