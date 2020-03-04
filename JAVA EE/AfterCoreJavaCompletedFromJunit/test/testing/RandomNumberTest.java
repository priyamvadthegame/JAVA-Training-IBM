package testing;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.RandomNumber;
@RunWith(Parameterized.class)
public class RandomNumberTest {
	public static RandomNumber random;
	public double checkNumber;
	public RandomNumberTest()
	{
		checkNumber=new RandomNumber().generate();
	}
	@Parameters
	public static Collection<Object[]> testList()
	{
		return Arrays.asList(new Object[][] {
			{},{},{},{}
		});
	}
	
	
	@Test
	public void test2() {
		assertTrue(checkNumber<100.0);
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("testing completed");
	}
}
