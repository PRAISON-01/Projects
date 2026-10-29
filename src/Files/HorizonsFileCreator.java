package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HorizonsFileCreator {

    public static void main(String[] args) {
//        Define the path that points to that points to the file you are trying to work with
//        Unix path - home/username/Desktop

//        String filePath = "/home/praise/IdeaProjects/Project";
//        Path path = Path.of(filePath);
//
//        System.out.println(
//                path.getFileSystem()
//        );
//
//        System.out.println(
//                path.getRoot()
//        );


        try{
            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/File";
            Path path = Path.of(fileLocation);
            Files.write(path, "------------------ You can't see me ------------------".getBytes());
        } catch(IOException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }

//        1255800
//        135

//        Use a method of class file to work with the path
    }
}
