package dataStructures.stack;

public class MyStack {
//    private boolean isEmpty = true;
    private int size = 0;
    private final String[] elements = new String[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String element) {
        if(size > elements.length) throw new ArrayIndexOutOfBoundsException("Stack is full");
        this.elements[size++] = element;

    }

    public String pop() {
        if(isEmpty()) throw new IllegalArgumentException("Can't pop elements stack!!!");

        return elements[--size];
    }

    public String peek() {
        if(isEmpty()) throw new IllegalArgumentException("Can't peek empty stack");
        return elements[size - 1];
    }

    public int search(String element) {
        int count = 1;
        for(String item : elements){
            if(element.equals(item)){
                count++;
                return count;
            }
        }
        return -1;
    }
}
