package MiniTask;

import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static MiniTask.NumberBaseConverter.getBaseConversion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberBaseConversionTest {
    @Test
    public void test_that_ten_from_base_ten_to_base_two_1010() {
        String conversion= getBaseConversion(10, 10, 2);
        String result = "1010";
        assertEquals(conversion, result);
    }

    @Test
    public void test_that_ten_from_base_ten_to_base_ten_expect10() {
        String conversion= getBaseConversion(10, 10, 10);
        String result = "10";
        assertEquals(conversion, result);
    }
    @Test
    public void test_that_0_from_base_ten_to_base_eight_return_0() {
        String conversion= getBaseConversion(0, 10, 8);
        String result = "0";
        assertEquals(conversion, result);
    }

    @Test
    public void test_that_22_from_base_ten_to_base_two_10110() {
        String conversion= getBaseConversion(22, 10, 2);
        String result = "10110";
        assertEquals(conversion, result);
    }

    @Test
    public void test43FromBaseEight_toBaseTen_expects35() {
        String conversion= getBaseConversion(43, 8, 10);
        String result = "35";
        assertEquals(conversion, result);
    }
    @Test
    public void test1037FromBaseEight_toBase10_expects543() {
        String conversion= getBaseConversion(1037, 8, 10);
        String result = "543";
        assertEquals(conversion, result);
    }

    @Test
    public void test1037FromBaseEight_toBaseTwo_expects1000011111() {
        String conversion= getBaseConversion(1037, 8, 2);
        String result = "1000011111";
        assertEquals(conversion, result);
    }



}
