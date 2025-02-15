import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @Test
    void addElementIncreasesSize() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("element");
        assertEquals(1, list.size());
    }

    @Test
    void getElementByIndex() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("element");
        assertEquals("element", list.get(0));
    }

    @Test
    void getElementByInvalidIndexThrowsException() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void removeElementByIndex() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("element");
        assertEquals("element", list.remove(0));
        assertEquals(0, list.size());
    }

    @Test
    void removeElementByInvalidIndexThrowsException() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void addMultipleElementsAndCheckOrder() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void removeElementUpdatesTail() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals(2, list.get(1));
    }
}