package edu.hm.cs.swa.lab01;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class MainClassTest {
	
	private String expectedResult;
	private SomeClass someClass;
	private Renderer renderer;
	private final static int MAGIC_ARRAY[] = {1, 2, 3};
	private final static Date MAGIC_DATE = new Date(123456789);
	
	
	@Before
	public void initialize() {
		renderer = new Renderer(someClass);
	}
	
	public MainClassTest(SomeClass someClass, String expectedResult) {
		this.someClass = someClass;
		this.expectedResult = expectedResult;
	}

	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new SomeClass(20), "getFoo (int) " + 20 + String.format("%n") +
				  "foo (int) " + 20 + String.format("%n") +
				  "array (int[]) " + Arrays.toString(MAGIC_ARRAY) + String.format("%n") +
				  "nullArray (int[]) " + String.format("%n") +
				  "date (Date) " + MAGIC_DATE + String.format("%n") },
			{new SomeClass(30), "getFoo (int) " + 30 + String.format("%n") +
			  "foo (int) " + 30 + String.format("%n") +
			  "array (int[]) " + Arrays.toString(MAGIC_ARRAY) + String.format("%n") +
			  "nullArray (int[]) " + String.format("%n") +
			  "date (Date) " + MAGIC_DATE + String.format("%n") }
			}
		);
	}

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
    	try {
			assertEquals(expectedResult,
					renderer.render());
			
		} catch (RuntimeException e) {
		  
			e.printStackTrace();
		} 
    }
}
