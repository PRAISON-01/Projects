package NamingLogicTest;

import NamingLogic.FileNamingLogic;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileNamingTest {
    @ParameterizedTest
    @CsvSource(value = {
            "My name is praise️#$%^&*, my_name_is_praise.mp4"
    })
    public void testThat_logicChangesName(String inputFile, String expected) throws IOException {
        String actual = FileNamingLogic.name(inputFile, "/home/praise/IdeaProjects/Project/src/Files/");
        assertEquals(
                expected, actual
        );
    }



}
