package Dairy;
import java.util.ArrayList;

public class Diaries {
     private ArrayList<Diary> diaries = new ArrayList<>();
     private int count;


     public void add(String username, String password) {
          for(Diary diary : diaries) {
               if(diary.getUsername().equals(username)) {
                    throw new IllegalArgumentException("Username already available");
               }
          }
          Diary diary = new Diary(username, password);
          diaries.add(diary);
          count = count+ 1;

     }

     public int count() {
          return count;
     }

     public Diary findByUserName(String userName) {
          for(Diary diary : diaries) {
               if(diary.getUsername().equals(userName)) {
                    return diary;
               }
          }
          return null;
     }

     public void delete(String username, String password) {

          Diary diary = findByUserName(username);
          if(diary.equals(null)) throw new IllegalArgumentException("Username not found!!!");
          if(diary.getPassword().equals(password)) {
               diaries.remove(diary);
               count = count - 1;
          }
          else{
               throw new IllegalArgumentException("incorrect password!!!");
          }
     }
}
