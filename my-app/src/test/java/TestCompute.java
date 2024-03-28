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
  public void zeroSizeTest(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);

    int i = c.countNumberOfOccurrences("0");
    assertTrue(i==-1);
  }
  @Test
  public void messageQueueDoesNotContainTest(){
    MessageQueue mq = mock(MessageQueue.class);
    String s = "not included";
    mq.contains(s);
    when(mq.size()).thenReturn(1);
    when(mq.contains("not included")).thenReturn(false);
    c = new Compute(mq);

  assertTrue(c.countNumberOfOccurrences(s)==0);

  }
  @Test
  public void messageQueueDoesContainTest(){
    MessageQueue mq = mock(MessageQueue.class);
    String s = "included";
    mq.contains(s);
    when(mq.size()).thenReturn(1);
    when(mq.contains("included")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("included");
    c = new Compute(mq);
    assertTrue(c.countNumberOfOccurrences(s)==1);

  }
  @Test
  public void messageQueueDoesContainAtAnotherI(){
    MessageQueue mq = mock(MessageQueue.class);
    String s = "included";
    mq.contains(s);
    when(mq.size()).thenReturn(2);
    when(mq.contains("included")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("ahmet");
    when(mq.getAt(1)).thenReturn("included");
    c = new Compute(mq);

    assertEquals(1, c.countNumberOfOccurrences("included"));


  }
  @Test
  public void messageQueueDoesContainMultpile(){
    MessageQueue mq = mock(MessageQueue.class);
    String s = "included";
    mq.contains(s);
    when(mq.size()).thenReturn(2);
    when(mq.contains("included")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("included");
    when(mq.getAt(1)).thenReturn("included");
    c = new Compute(mq);

    assertEquals(2, c.countNumberOfOccurrences("included"));

  }


}