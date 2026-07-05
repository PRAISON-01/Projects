package Dairy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    @Test
    public void newDairies_AddDiaries_AddUserName() {
        Diaries diaries = new Diaries();
        assertEquals(0, diaries.count());
        diaries.add("@praisenwakwo", "password");
        assertEquals(1, diaries.count());
    }

    @Test
    public void newDiaries_diaryWithTheSameUserName_throwsException() {
        Diaries diaries = new Diaries();
        diaries.add("@praisenwankwo", "password");
        assertThrows(IllegalArgumentException.class, ()-> diaries.add("@praisenwankwo", "password"));

    }

    @Test
    public void newDiaries_findByUserName_returnsNull() {
        Diaries diaries = new Diaries();
        assertSame(null, diaries.findByUserName("@emmanuelnneji"));
    }

    @Test
    public void newDiaries_addDiary_findByUserName_returnsDiary() {
        Diaries diaries = new Diaries();
        diaries.add("@praisenwankwo", "password");
//        assertNull(diaries);

        assertNotNull(diaries.findByUserName("@praisenwankwo"));
    }

    @Test
    public void newDiaries_addDiary_DeleteDiary_wrongpassword() {
        Diaries diaries = new Diaries();
        diaries.add("@praisenwankwo", "password");
        assertEquals(1,diaries.count());

        diaries.delete("@praisenwankwo", "password");
        assertEquals(0, diaries.count());
    }


}
