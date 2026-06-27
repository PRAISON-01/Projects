package arrayList;

public class ArrayList {
    private String[] stringArray = new String[10];
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public ArrayList(int initialCapacity) {
        if(initialCapacity < 0) throw new IllegalArgumentException("Capacity cannot be null");
        this.stringArray = new String[initialCapacity];
    }

    public int getCapacity() {
        return this.stringArray.length;
    }



    public ArrayList() {
        this.stringArray = new String[10];
    }

    public ArrayList(String[] elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        this.stringArray = new String[elements.length];
        for(int count = 0; count < elements.length; count++){
            this.stringArray[count] = elements[count];
        }
    }

    public boolean add(String element) {
        if(size == stringArray.length) {
            resize();
        }
        stringArray[size++] = element;
        return true;
    }

    public int size() {
        return size;
    }

    private void resize() {
        String[] newArray = new String[stringArray.length * 2];
            for(int count = 0; count < stringArray.length; count++) {
                newArray[count] = stringArray[count];
            }
        stringArray = newArray;
    }

    public String get(int index) {
        if(index < 0 || index >= size())throw new IllegalArgumentException("Index out of range !!!");
        return stringArray[index];
    }


    public String getFirst() {
        if(isEmpty()) throw new IllegalArgumentException("nothing!!!");
        return stringArray[0];
    }

    public String getLast() {
        if(isEmpty()) throw new IllegalArgumentException("nothing!!!");
        return stringArray[size - 1];
    }

    public String set(int index, String element) {
        if(index < 0 || index >= size())throw new IllegalArgumentException("Index out of range !!!");
        stringArray[index] = element;
        return stringArray[index];
    }


    public String remove(int index) {
        if(index < 0 || index >= size())throw new IllegalArgumentException("Index out of range !!!");
        String element = stringArray[index];
        stringArray[--size] = null;
        return element;
    }


}

