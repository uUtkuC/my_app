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
    c = new Compute(mq);


    assertTrue(i==-1);
  }





}