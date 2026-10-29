package MiniTask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GoodMorningTest {

    @Test
    public void nonsenseTest() {
        int[] array = {2, 4, 3, 8, 2, 1, 3};
        int[] result = {2, 4, 8, 3, 1, 2, 3};
        int[] actual = GoodMorning.oddSumSwap(array);
        assertArrayEquals(result , actual);
    }

    @Test
    public void nonsenseTest2() {
        int[] array = {2, 4, 3, 8, 2, 1};
        int[] result = {2, 4, 8, 3, 1, 2};
        int[] actual = GoodMorning.oddSumSwap(array);
        assertArrayEquals(result , actual);
    }

    @Test
    public void nonsenseTest3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {2, 1, 4, 3, 6, 5, 8, 7, 9};
        int[] actual = GoodMorning.oddSumSwap(array);
        assertArrayEquals(result , actual);
    }
}
