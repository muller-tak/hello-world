import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testMain() {
		String[] args = {"Hello", "World"};
		try {
			HelloWorld.main(args);			
		} catch (Exception e) {
			fail();
		}
	}

}
