package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test
    public void newQueueIsNotNull(){ assertNotNull(new Queue());}

    @Test
    public void NewQueueIsEmpty(){
        Queue<Integer> queue = new Queue<>();
        assertEquals(true,queue.isEmpty());
    }
}
