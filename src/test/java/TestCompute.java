import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }


  @Test
    public void testCountNumberOfOccurrencesSizeZero() {
        MessageQueue mq = mock(MessageQueue.class);
        when(mq.size()).thenReturn(0);
        c = new Compute(mq);
      assertEquals("Count of occurrences when queue size is zero", -1, c.countNumberOfOccurrences(""));
    }

    @Test
    public void testCountNumberOfOccurrencesDoesNotContain() {
        MessageQueue mq = mock(MessageQueue.class);
        when(mq.size()).thenReturn(1);
        when(mq.contains("")).thenReturn(false);
        c = new Compute(mq);
        assertEquals("Count of occurrences when element does not exist in queue", 0, c.countNumberOfOccurrences(""));
    }

    @Test
    public void testCountNumberOfOccurrencesSingleOccurrence() {
        MessageQueue mq = mock(MessageQueue.class);
        when(mq.size()).thenReturn(1);
        when(mq.contains("")).thenReturn(true);
        when(mq.getAt(0)).thenReturn("");
        c = new Compute(mq);
        assertEquals("Count of occurrences for a single occurrence", 1, c.countNumberOfOccurrences(""));
    }

    @Test
    public void testCountNumberOfOccurrencesMultipleOccurrences() {
        MessageQueue mq = mock(MessageQueue.class);
        when(mq.size()).thenReturn(3);
        when(mq.contains("")).thenReturn(true);
        when(mq.getAt(0)).thenReturn("");
        when(mq.getAt(1)).thenReturn("a");
        when(mq.getAt(2)).thenReturn("");
        c = new Compute(mq);
        assertEquals("Count of occurrences for multiple occurrences", 2, c.countNumberOfOccurrences(""));
    }

}