package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest extends MyClass {
public void testReturnTrue(){
	ReturnTrue();
	assertEquals(true,ReturnTrue());
}
public void testAddTwoNumbers() {
	AddTwoNumbers(2,3);
	assertEquals(5,AddTwoNumbers(2,3));
}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
