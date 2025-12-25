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
  public void testComputeIsLenghtOne() {
    assertFalse(c.compute(0));
    }

  @Test
  public void testComputeIsLengthEven() {
    assertFalse(c.compute(0,1));
  }

  @Test(expected = RuntimeException.class)
  public void testIsZero() {
    c.compute(0,1,2);
  }

  @Test
    public void testComputeIsDivisibleBySum() {
    assertTrue(c.compute(1, 2, 3));
  }


  @Test
  public void testComputeIsNotDivisibleBySum() {
    assertFalse(c.compute(2, 3, 6));
  }


}



