package Dairy;

import java.util.ArrayList;

public class Diary {
    private int count;
    private String username;
    private String password;
    private ArrayList<Entry> entries = new ArrayList<>();
    private boolean isLocked = true;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {
        if(this.password.equals(password)) isLocked = false;
    }

    public void lockDairy() {
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        if(isLocked == true) throw new IllegalArgumentException("Unlock Dairy Before Creating Entry!!!");
        int ID = generateID();
        Entry entry = new Entry(ID, title, body);
        entries.add(entry);
    }

    public int generateID() {
        this.count = count + 1;
        return this.count;
    }



    public Entry findDairyByID(int ID) {
        if(isLocked == true)throw new IllegalArgumentException("Unlock diary first!!!");
//        if(entries.contains(ID)) entries.get((ID - 1));
        for(Entry entry : entries) {
            if(entry.getID() == ID) {
                return entry;
            }
        }
        return null;
    }

    public void deleteEntry(int ID) {
        if(isLocked == true)throw new IllegalArgumentException("Unlock diary first!!!");
//        if(entries.contains(ID)) entries.remove((ID - 1));
        Entry entry = findDairyByID(ID);
        if(entry.getID() == ID) {
            entries.remove(entry);
        }
    }

    public void updateDiary(int ID, String title, String body) {
//        Entry newEntry;
        if(isLocked == true) throw new IllegalArgumentException("Unlock Dairy Before Creating Entry!!!");
        for(Entry entry : entries) {
            if(entry.getID() == ID) {
                entry.setBody(body);
                entry.setTitle(title);
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //    public void
}
