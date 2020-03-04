package testing;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.Calculator;

public class CalculatorTest {
	public static Calculator c;
	@BeforeClass
	public static void instantiate()
	{
		c=new Calculator();
	}
	@Test
	public void test() {
		assertThrows(ArithmeticException.class,()->c.divide(15,0));
	}
	@Test
	@Ignore
	public void test1() {
		assertEquals(2,c.divide(15,3));
	}
	@Test(timeout = 500)
	public void test2() {
		while(true);
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("testing completed");
	}
}
