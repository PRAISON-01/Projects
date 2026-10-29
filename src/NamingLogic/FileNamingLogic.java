package NamingLogic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNamingLogic {
    public static String name(String content, String savingDestination) throws IOException {


        String savingFileAs = content.toLowerCase().trim().replace(" ", "_");

        savingFileAs = savingFileAs.replaceAll("[^a-zA-Z0-9_]", "");

        System.out.printf("file new format : %s",savingFileAs);


        savingFileAs = savingFileAs + ".mp4";


        Path finalSaveLocation = Path.of(savingDestination, savingFileAs);

        Files.createFile(finalSaveLocation);

        if (!Files.exists(finalSaveLocation)) {
            Files.createFile(finalSaveLocation);
            System.out.println("Empty video placeholder created successfully at: " + finalSaveLocation);
        } else {
            System.out.println("File already exists: " + finalSaveLocation);
        }



        return savingFileAs;
    }
}
