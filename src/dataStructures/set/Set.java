package dataStructures.set;

public class Set {
    private boolean isEmpty = true;
    private String[] elements = new String[5];
    private int size;

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean add(String element) {
        if(element == null) throw new IllegalArgumentException("Set cannot take null element!!!");
        isEmpty = false;

        if(size == elements.length){
            resize();
        }

        if(!contains(element)){
            elements[size++] = element;
        }
//

        return true;
    }

    public boolean remove(String element) {
        if (element == null) throw new IllegalArgumentException("cannot remove null element");
        int target = -1;

        for (int count = 0; count < size; count++) {
            if (element.equals(elements[count])) {
                target = count;
                break;
            }
        }

        if (target == -1) {
            return false;
        }

       for(int count = target; count < size - 1; count++){
           this.elements[count] = elements[count + 1];
       }

       this.elements[--size] = null;
       return true;
    }

    public int size() {
        return size;
    }

    private void resize() {

        String[] newCollection = new String[elements.length * 2];

        for(int count = 0; count < elements.length; count++) newCollection[count] = elements[count];

        elements = newCollection;
    }


    public boolean  contains(String element) {
        if(element == null ) throw new IllegalArgumentException("Null argument");
        for(String item : elements){
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

   public String[] toArray() {
       String[] newArray = new String[size];
       for(int count = 0; count < size; count++){
           newArray[count] = elements[count];
       }
       return newArray;
   }

    public void clear() {
        size = 0;
    }
}
