package queue;

public class Queue {
//    private boolean isEmpty = true;
    private final String[] elements = new String[5];
    private int size = 0;
//    private int removeElementCount;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(String element) {
        if(element.isEmpty()) throw new IllegalArgumentException("Empty String");
//        isEmpty = false;
        if(size > elements.length) throw new ArrayIndexOutOfBoundsException("Out of bound nigga!");
        increaseSize(element);

        return true;
    }

    public boolean offer(String element) {
        if(element.isEmpty()) return false;
        if(size > elements.length) throw new ArrayIndexOutOfBoundsException("Out of bound nigga!!!");
        increaseSize(element);


        return true;
    }


    public String remove() {
        if(size == 0) throw new IllegalArgumentException("The queue is empty!!!");

        return firstElementElimination();

    }

    private void increaseSize(String element) {
        this.elements[size++] = element;
    }

    public String poll(){
        if(isEmpty()) return null;

        return firstElementElimination();
    }

    public String element() {
        if(isEmpty()) throw new IllegalArgumentException("Oga oga, nothing dey here!!!");
        return elements[0];
    }

    public String peek() {
        if(isEmpty()) return null;
        return elements[0];
    }

    private String firstElementElimination() {
        String firstElement = elements[0];
        for( int iterator = 0; iterator < size - 1; iterator++){
            elements[iterator] = elements[iterator + 1];
        }

        elements[size - 1] = null;
        size--;
        return firstElement;
    }
}
