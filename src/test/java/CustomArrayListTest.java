import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void addElementIncreasesSize() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("element");
        assertEquals(1, list.size());
    }

    @Test
    void getElementByIndex() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("element");
        assertEquals("element", list.get(0));
    }

    @Test
    void getElementByInvalidIndexThrowsException() {
        CustomArrayList<String> list = new CustomArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void removeElementByIndex() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("element");
        assertEquals("element", list.remove(0));
        assertEquals(0, list.size());
    }

    @Test
    void removeElementByInvalidIndexThrowsException() {
        CustomArrayList<String> list = new CustomArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void addElementBeyondInitialCapacity() {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        assertEquals(11, list.size());
        assertEquals(10, list.get(10));
    }
}