package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack();
    }

    @Test
    public void newStack_isEmpty() {

        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushStringIntoStack_StackIsNotEmpty() {
        stack.push("Uncle Bob");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushMoreThan5String_throwsError() {
        stack.push("Uncle bob");
        stack.push("bob is my uncle");
        stack.push("Spongebob");
        stack.push("Patrick");
        stack.push("squidward");
        assertThrows(ArrayIndexOutOfBoundsException.class , ()-> stack.push("sandy cheeks"));
    }

    @Test
    public void popStringFromEmptyStack_StackThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> stack.pop());
    }

    @Test
    public void pushAndPopString_StackIsEmpty() {
        stack.push("Uncle Bob");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushStringTwiceAndPopOnce_StackIsNotEmpty() {
        stack.push("Uncle Bob");
        stack.push("Martin Fowler");
        stack.pop();
        assertFalse(stack.isEmpty());
    }



    @Test
    public void pushString_popReturnsString() {
        stack.push("Martin Walker");
        stack.push("Uncle Bob");
        stack.push("Alan Walker");
        stack.push("Grady booch");
        stack.push("Bjarne");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("semicolo");
        stack.push("testing something sha");
        stack.push("Get in joor!");
        assertEquals("Get in joor!", stack.pop());
    }

    @Test
    public void peekNewStack_throwsException() {
        assertThrows(IllegalArgumentException.class , ()-> stack.peek());
    }

    @Test
    public void pushStirngIntoStack_returnsLastElementPushed() {
        stack.push("Wizard of oz");
        stack.push("Uncle Bob");
        assertEquals("Uncle Bob", stack.peek());
    }

    @Test
    public void pushTwicePopOnce_PeekRetursLastElementPushed() {
        stack.push("Wizard of oz");
        stack.push("Uncle Bob");
        stack.push("Tony stark");
        stack.pop();
        assertEquals("Uncle Bob", stack.peek());
    }


    @Test
    public void push5StringsSearchForSecondElement_SearchReturnsThePositionOfTheElement() {
        stack.push("Wizard of oz");
        stack.push("Uncle Bob");
        stack.push("Tony stark");
        stack.push("peter parker");
        assertEquals(2, stack.search("Uncle Bob"));
    }

    @Test
    public void push5StringsSearchForElementNotInStack_returnNegative1() {
        stack.push("Wizard of oz");
        stack.push("Uncle Bob");
        stack.push("Tony stark");
        stack.push("peter parker");
        assertEquals(-1, stack.search("Praise"));
    }





}
