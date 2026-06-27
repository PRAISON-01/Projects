package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList arrayList;

    @BeforeEach
    public void setUp() {
        arrayList = new ArrayList();
    }

    @Test
    public void newArrayList_initialCapacityOf5_assertInitialCapacity() {
        ArrayList arrayList = new ArrayList(5);
        assertEquals(5,arrayList.getCapacity());
    }

    @Test
    public void newArrayList_negativeInitialCapacity_assertInitialCapacity() {
//        ArrayList arrayList = new ArrayList();
        assertThrows(IllegalArgumentException.class, ()-> new ArrayList(-5));
    }

    @Test
    public void newArrayList_emptyConstructor_capacityIs10() {
//        ArrayList arrayList = new ArrayList();
        assertEquals(10, arrayList.getCapacity());
    }

    @Test
    public void arrayListWithNullCollection_throwException() {
        assertThrows(IllegalArgumentException.class, () -> new ArrayList((String[]) null));
    }

    @Test
    public void collectionOfThreeNames_collectedIntoArrayList_capacityIsThree() {
        String[] names = {"Uncle Bob", "Spongebob", "Patrick"};

        ArrayList arrayList = new ArrayList(names);
        assertEquals(3, arrayList.getCapacity());

    }

    @Test
    public void newArraylist_addString_addReturnsTrue() {
        assertTrue(arrayList.add("Uncle bob"));
    }

    @Test
    public void mewArrayList_addThreeElement_sizeIs3() {
        arrayList.add("Uncle bob");
        arrayList.add("SpongeBob");
        arrayList.add("Kent beck");
        assertEquals(3, arrayList.size());
    }

    @Test
    public void newArraylist_addedStringMoreThan5_StringsAreAddedToArrayList() {
        arrayList.add("Uncle bob");
        arrayList.add("SpongeBob");
        arrayList.add("Shaggy");
        arrayList.add("Velma");
        arrayList.add("Daphne");
        arrayList.add("Scooby");
        arrayList.add("Fred");
        arrayList.add("Starlight");
        arrayList.add("Homelander");
        arrayList.add("Black noir");
        arrayList.add("Deep");
        arrayList.add("Fire Cracker");
        arrayList.add("Maven");
        assertEquals(13, arrayList.size());
    }

    @Test
    public void newArray_get_throwExcpetion() {
        arrayList.add("uncle bob");
        assertThrows(IllegalArgumentException.class, ()-> arrayList.get(1));
    }

    @Test
    public void addElements_get_ReturnsElementAtIndex() {
        arrayList.add("Uncle bob");
        arrayList.add("Sponge bob");
        arrayList.add("bob the builder");
        assertEquals("bob the builder", arrayList.get(2));
        assertEquals("Uncle bob", arrayList.get(0));
    }

    @Test
    public void newArrayList_getFirst_throwExcpetion() {
        assertThrows(IllegalArgumentException.class, ()-> arrayList.getFirst());
    }

    @Test
    public void addElement_getFirst_returnsNumberAtFirstIndex() {
        arrayList.add("Uncle bob");
        arrayList.add("Sponge bob");
        arrayList.add("bob the builder");
        assertEquals("Uncle bob", arrayList.getFirst());
    }

    @Test
    public void newArrayList_getLast_throwExcpetion() {
        assertThrows(IllegalArgumentException.class, ()-> arrayList.getLast());
    }

    @Test
    public void addElement_getLast_returnsNumberAtFirstIndex() {
        arrayList.add("Uncle bob");
        arrayList.add("Sponge bob");
        arrayList.add("bob the builder");
        assertEquals("bob the builder", arrayList.getLast());
    }

    @Test
    public void addElement_setElementAtNonExistingIndex_ThrowException() {
        arrayList.add("Bob is my uncle");
        assertThrows(IllegalArgumentException.class, ()-> arrayList.set(1,"Uncle bob"));
    }

    @Test
    public void addElement_setElement_replaceElementAtSpecifiedIndex() {
        arrayList.add("bob is my unlce");
        arrayList.add("Sponge bob");
        arrayList.add("bob the builder");
        arrayList.set(0, "Uncle bob");
        assertEquals("Uncle bob", arrayList.get(0));
    }

    @Test
    public void newArrayList_removeElement_throwException() {
       assertThrows(IllegalArgumentException.class, ()-> arrayList.remove(10));
    }

    @Test
    public void addElements_removeElement_returnsElementAtIndex() {
        arrayList.add("bob is my unlce");
        arrayList.add("Sponge bob");
        arrayList.add("bob the builder");
        assertEquals("bob the builder", arrayList.remove(2));
    }


}
