package set;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    public void setUp() {
        set = new Set();
    }
    @Test
    public void newSet_isEmpty_assertTrue() {
//        Set set = new Set();
        assertTrue(set.isEmpty());
    }

    @Test
    public void addElementToSet_isEmpty_assertFalse() {
//        Set set = new Set();
        set.add("Uncle bob");
        assertFalse(set.isEmpty());
    }

    @Test
    public void newSet_addElement_isEmptyIsTrue() {
//        Set set = new Set();
        assertTrue(set.add("Spider man"));
    }


    @Test
    public void newSet_addNullElement_throwsException() {
        assertThrows(IllegalArgumentException.class, ()-> set.add(null));
    }

    @Test
    public void newSet_RemoveNullElement_throwException() {
        assertThrows(IllegalArgumentException.class, ()-> set.remove(null));
    }

    @Test
    public void newSet_addRemoveElement_removeIsTrue() {
        set.add("Uncle bob");
        assertTrue(set.remove("Uncle bob"));
    }

    @Test
    public void newSet_addXElementRemoveYElement_removeIsFalse() {
        set.add("Uncle bob");
        assertFalse(set.remove("Spider man"));
    }

    @Test
    public void newSet_addingElement_sizeReturnsNumberOfElement() {

        set.add("Uncle bob");
        set.add("SpongeBob");
        set.add("Lady morgana");

        assertEquals(3, set.size());
    }

    @Test
    public void newSet_containsNullElement_throwsException() {
        assertThrows(IllegalArgumentException.class, ()-> set.contains(null));
    }

    @Test
    public void addElementToSet_containsElement_ElementIsThereReturnsFalse() {
        set.add("Uncle Bob");
        set.add("SpongeBob");
        assertFalse(set.contains("spider man"));

    }
    @Test
    public void addElementToSet_containsElement_ElementIsThereReturnsTrue() {
        set.add("Uncle Bob");
        set.add("SpongeBob");
        assertTrue(set.contains("SpongeBob"));
    }

    @Test
    public void newSet_toArray_arrayOfElements() {
        set.add("Tony stark");
        set.add("Bruce Wayne");
        assertArrayEquals(new String[]{"Tony stark", "Bruce Wayne"}, set.toArray());
    }

    @Test
    public void newSet_addDuplicateElement_OnlyOneIsAddedToArray() {
        set.add("Semicolon");
        set.add("Vought");
        set.add("Vought");
        assertEquals(2, set.size());
    }

    @Test
    public void addElements_clear_sizeReturns0() {
        set.add("Semicolon");
        set.add("Vought");
        set.add("Homelander");
        set.clear();
        assertEquals(0, set.size());
    }

}
