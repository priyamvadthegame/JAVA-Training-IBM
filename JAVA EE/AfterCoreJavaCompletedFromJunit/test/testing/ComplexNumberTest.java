package testing;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.junit.Complex;
@RunWith(Parameterized.class)
public class ComplexNumberTest {
	 public Complex complex1,complex2,result;
	 public int imaginary;
	 public int real;
	 public ComplexNumberTest(int imaginary,int real,int imaginary1,int real1) {
		 complex2=new Complex(real1, imaginary1);
		 complex1=new Complex(real, imaginary);
		 result=new Complex(real1+real, imaginary1+imaginary);
	 }
	 
		
	 @Parameters
	 public static Collection<Object[]> add()
	 {
		return Arrays.asList(new Object[][]{{1,2,3,4},{5,6,7,8},{5,4,7,9}});
		 
	 }
	@Test
	public void test() {
		assertEquals(result, complex1.add(complex2));
	}

}
