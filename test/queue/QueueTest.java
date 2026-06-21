package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }
    @Test
    public void newQueue_isEmptyIsTrue() {
//        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addStringToQueue_isEmptyIsFalse() {
//        Queue queue = new Queue();
        queue.add("Uncle bob");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void addStringToQueue_addIsTrue() {
        assertTrue(queue.add("Uncle Bob"));
    }

    @Test
    public void addMoreThan5elementsToQueue_throwOutOfBoudError() {
        queue.add("Spongebob");
        queue.add("Patrick");
        queue.add("Squidward");
        queue.add("Sandy");
        queue.add("Mr Krabs");
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> queue.add("Larry"));
    }

    @Test
    public void addEmptyStringToQueue_throwError() {
        queue.add("Spongebob");
        queue.add("Patrick");
        assertThrows(IllegalArgumentException.class, ()-> queue.add(""));
    }


    @Test
    public void offerStringtoQueue_offerIsTrue() {
        assertTrue(queue.offer("Element"));
    }

    @Test
    public void offerMoreThan5StringToQueue_ThrowsException() {
        queue.offer("Scooby");
        queue.offer("shaggy");
        queue.offer("velma");
        queue.offer("fred");
        queue.offer("Daphne");
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->  queue.offer("Puppet Master"));
    }

    @Test
    public void offerEmptyString_queueIsFalse() {
        assertTrue(queue.offer("Spider man"));
        assertFalse(queue.offer(""));
    }

    @Test
    public void removeFromEmptyQueue_throwException() {
        assertThrows(IllegalArgumentException.class, ()-> queue.remove());

    }

    @Test
    public void removeFromQueue_returnHeadElement() {
        queue.add("One piece");
        queue.add("Demonslayer");
        queue.offer("Vinland Saga");
        queue.offer("Dragon ball");
        assertEquals("One piece", queue.remove());
    }

    @Test
    public void pollEmptyQueue_pollReturnsNull() {
        assertNull(queue.poll());
    }


    @Test
    public void pollQueue_pollReturnsHeadElement() {
        queue.add("Uncle boob");
        queue.add("Martin Fowler");
        queue.offer("Star wars");
        assertEquals("Uncle boob", queue.poll());
    }

    @Test
    public void elementEmptyQueue_throwException() {
        assertThrows(IllegalArgumentException.class, ()-> queue.element());
    }


    @Test
    public void AaddFourTimesElementQueueRemoveOnce_elementReturnsHeadElement() {
        queue.add("Scooby");
        queue.add("Batman");
        queue.add("Isaac Newton");
        queue.add("Jamaine cole");
        queue.remove();
        assertEquals("Batman", queue.element());
    }

    @Test
    public void offerFourTimesElementQueuePollTwice_elementReturnsHeadElement() {
        queue.offer("Scooby");
        queue.offer("Batman");
        queue.offer("Isaac Newton");
        queue.offer("Jamaine cole");
        queue.poll();
        queue.poll();
        assertEquals("Isaac Newton", queue.element());
    }

    @Test
    public void emptyQueue_PeekIsNull() {
        assertNull(queue.peek());
    }


    @Test
    public void offerFourTimePollTwice_peekReturnsHeadElement() {
        queue.offer("Scooby");
        queue.offer("Batman");
        queue.offer("Isaac Newton");
        queue.offer("Jamaine cole");
        queue.poll();
        assertEquals("Batman", queue.peek());
    }





}
