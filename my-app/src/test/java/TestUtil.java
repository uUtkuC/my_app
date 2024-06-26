import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void singleArgTest(){
    boolean i = c.compute(1);
    assertTrue(i==false);
  }
  @Test
  public void evenLengthArgTest(){
    boolean i = c.compute(1,2);
    assertTrue(i==false);
  }
  @Test
  public void oddLengthArgTest(){
    boolean i = c.compute(1,2);
    assertTrue(i==false);
  }
  @Test
  public void sumIsMultipleOfItsComponents(){
    boolean i = c.compute(1,2,3);

    assertTrue(i==true);

  }
  @Test
  public void sumIsUnqiue(){
    boolean i = c.compute(5,2,4);

    assertTrue(i==false);

  }
  @Test(expected=RuntimeException.class)
  public void inputZeroIsEntered(){
    c.compute(5,2,0);


  }


}