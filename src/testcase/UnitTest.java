package testcase;

import static org.junit.Assert.*;
import main.MyClass;

import org.junit.Test;

public class UnitTest {

	@Test
	public void AddTwoNumbers() {
		
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		
		int result = 0;
		
		MyClass c = new MyClass();
		result = c.AddTwoNumbers(number1, number2);
		
		assertEquals(number3, result);
	}


	@Test
	public void ReturnTrue() {
		
		boolean function;
		MyClass r = new MyClass();
		function = r.ReturnTrue();
		
		assertTrue(function);
		}
}