package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;

public class FetchingVideo {


    public static void main(String[] args) {
        String videoUrl = "https://encrypted-vtbn0.gstatic.com/video?q=tbn:ANd9GcTtht1OB2VGexsPBNb1o-l6x75xIxVcv2XqPA";
        URI uri = URI.create(videoUrl);
        try(
                InputStream inputStream = uri.toURL().openStream();

                FileOutputStream fileOutputStream = new FileOutputStream("video.mp4");
        ) {

            byte[] bytes = inputStream.readAllBytes();
            System.out.printf("Raw video bytes :: %s", Arrays.toString(bytes));
            fileOutputStream.write(bytes);



        } catch(
                IOException ex) {
            System.err.println(
                    ex.getMessage()
            );
        }
    }
}
