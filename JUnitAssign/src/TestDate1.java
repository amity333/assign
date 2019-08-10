import java.util.*;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.*;

@RunWith(Parameterized.class)
public class TestDate1 {

	Date date=null;
	public int input;
	public int expected;
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{30,30},{7,7},{2019,2019},{100,1},{0,10},{5,20}});//pass test
		//cases as array
				
	}
	
	public  TestDate1(int input,int expected) {
		this.input=input;
		this.expected=expected;
	}
	
	@Test
	public void testSetDay() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,30);
	}
	
	@Test
	public void testSetMonth() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,7);
	}
	

	@Test
	public void testSetYear() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,2019);
	}
	

	@Test
	public void testGetDay() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,date.getDay());
	}
	
	@Test
	public void testGetMonth() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,date.getMonth());
	}
	
	@Test
	public void testGetYear() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,date.getYear());
	}
	
	
}
