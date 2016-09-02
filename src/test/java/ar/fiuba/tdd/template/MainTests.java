package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void newQueueIsNotNull(){ assertNotNull(new Queue());}

    @Test
    public void newQueueIsEmpty(){
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void queueIsNotEmpty(){
        Queue<Integer> queue = new Queue<>();
        queue.add(11);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void lengthIsOne(){
        Queue<Integer> queue = new Queue<>();
        queue.add(11);
        assertEquals(1,queue.size());
    }

    @Test
    public void filledQueueViewTopElement(){
        Queue<Integer> queue = new Queue<>();
        queue.add(15);
        int top = queue.top();
        assertEquals(15,top);
    }

    @Test (expected=AssertionError.class)
    public void emptyQueueThrowsAssertionErrorForTop(){
        Queue<Integer> queue = new Queue<>();
        queue.top();
    }

    @Test (expected=AssertionError.class)
    public void emptyQueueThrowsAssertionErrorForRemove(){
        Queue<Integer> queue = new Queue<>();
        queue.remove();
    }

    @Test
    public void queueIsEmptyAfterDeleteLastElement(){
        Queue<Integer> queue = new Queue<>();
        queue.add(25);
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void queueHasSizeZeroAfterDeleteLastElement(){
        Queue<Integer> queue = new Queue<>();
        queue.add(25);
        queue.remove();
        assertEquals(0,queue.size());
    }

    @Test
    public void queueHasSizeThreeAfterThreeAdds(){
        Queue<Integer> queue = new Queue<>();
        queue.add(25);
        queue.add(35);
        queue.add(45);
        assertEquals(3,queue.size());
    }

    @Test
    public void queueHasSizeTwoAfterThreeAddsAndOneRemove(){
        Queue<Integer> queue = new Queue<>();
        queue.add(25);
        queue.add(35);
        queue.add(45);
        queue.remove();
        assertEquals(2,queue.size());
    }
}
