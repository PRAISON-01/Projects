package Dairy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Diary myDiary;

    @BeforeEach
    public void setUp() {
        myDiary = new Diary("@praise", "password");
    }

    @Test
    public void newDairy_isLocked() {
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void newDairy_unlock_isLocked_returnsTrue_lock_returns_false() {

        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());

        myDiary.lockDairy();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void newDairy_createNewEntry_DairyIsLocked_throwsException() {

        assertThrows(IllegalArgumentException.class, ()-> myDiary.createEntry("My Semicolon Journey", "This is my journey at semicolon is going..."));
    }


    @Test
    public void newDairy_FindEntryByID__createEntry_findEntryByID_returnsEntry() {
        int ID = 1;
//        System.out.println(ID);
        assertThrows(IllegalArgumentException.class, ()-> myDiary.findDairyByID(ID));

        myDiary.unlockDiary("password");
        myDiary.createEntry("My Semicolon Journey", "This is my journey at semicolon is going...");
        Entry foundEntry = myDiary.findDairyByID(ID);
//        System.out.println(foundEntry);
    }

    @Test
    public void newDiary_createEntry_deleteEntry_FindEntry_throwsException() {
        int ID = 1;
        myDiary.unlockDiary("password");

        myDiary.createEntry("My Semicolon Journey", "This is my journey...");

        assertNotNull(myDiary.findDairyByID(ID));

        myDiary.deleteEntry(ID);
        assertNull(myDiary.findDairyByID(ID));
    }

    @Test
    public void newDairy_createEntry_updateEntry_TitleAndBodyIsUpdated() {
        int ID = 1;
        myDiary.unlockDiary("password");
        myDiary.createEntry("My semicolon Journey", "This my journey at semicolon");
        Entry entry = myDiary.findDairyByID(ID);

        myDiary.updateDiary(ID, "My software engineering journey", "This journey hard no be small thing...");
        assertEquals("My software engineering journey", entry.getTitle());
        assertEquals("This journey hard no be small thing...", entry.getBody());
    }

}