import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void testSum() {
		MyMath mm = new MyMath();
		assertEquals(3, mm.sum(1,2));
	}

}
