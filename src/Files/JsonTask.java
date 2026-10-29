package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class JsonTask {

    static void main(String[] args) {


        post();
        posts();
        comment();
        comments();



    }


    public static void posts() {
        String postUrl = "https://jsonplaceholder.typicode.com/posts";
        URI uri = URI.create(postUrl);
        try( InputStream inputStream = uri.toURL().openStream();){



            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/Post.json";

            Path path = Path.of(fileLocation);
            Files.write(path, bytes);


        } catch(
                IOException ex) {
            System.err.println(
                    ex.getMessage()
            );
        }
    }



    public static void post() {
        String postUrl = "https://jsonplaceholder.typicode.com/posts/1";
        URI uri = URI.create(postUrl);
        try(InputStream inputStream = uri.toURL().openStream();){
            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/PostOne.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);


        } catch(
                IOException ex) {
            System.err.println(
                    ex.getMessage()
            );
        }
    }


    public static void comments() {
        String postUrl = "https://jsonplaceholder.typicode.com/posts/1/comments";
        URI uri = URI.create(postUrl);
        try(InputStream inputStream = uri.toURL().openStream();){
            byte[] bytes = inputStream.readAllBytes();


            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/Comments.json";
            Path path = Path.of(fileLocation);
            Files.write(path,bytes);


        } catch(
                IOException ex) {
            System.err.println(
                    ex.getMessage()
            );
        }
    }
    public static void comment() {
        String postUrl = "https://jsonplaceholder.typicode.com/comments?postId=1";
        URI uri = URI.create(postUrl);
        try(InputStream inputStream = uri.toURL().openStream();){
            byte[] bytes = inputStream.readAllBytes();


            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/Comment.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);


        } catch(
                IOException ex) {
            System.err.println(
                    ex.getMessage()
            );
        }
    }



}
