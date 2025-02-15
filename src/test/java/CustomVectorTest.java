import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomVectorTest {

    @Test
    void addElementIncreasesSize() {
        CustomVector<String> vector = new CustomVector<>(10, 5);
        vector.add("element");
        assertEquals(1, vector.size());
    }

    @Test
    void getElementByIndex() {
        CustomVector<String> vector = new CustomVector<>(10, 5);
        vector.add("element");
        assertEquals("element", vector.get(0));
    }

    @Test
    void getElementByInvalidIndexThrowsException() {
        CustomVector<String> vector = new CustomVector<>(10, 5);
        assertThrows(IndexOutOfBoundsException.class, () -> vector.get(0));
    }

    @Test
    void removeElementByIndex() {
        CustomVector<String> vector = new CustomVector<>(10, 5);
        vector.add("element");
        assertEquals("element", vector.remove(0));
        assertEquals(0, vector.size());
    }

    @Test
    void removeElementByInvalidIndexThrowsException() {
        CustomVector<String> vector = new CustomVector<>(10, 5);
        assertThrows(IndexOutOfBoundsException.class, () -> vector.remove(0));
    }

    @Test
    void addElementBeyondInitialCapacity() {
        CustomVector<Integer> vector = new CustomVector<>(10, 5);
        for (int i = 0; i < 11; i++) {
            vector.add(i);
        }
        assertEquals(11, vector.size());
        assertEquals(10, vector.get(10));
    }
}