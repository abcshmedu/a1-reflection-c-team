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
	
/*	@Before
	public void setUp() {
		final int magicNumber = 20;
		final int magicArray[] = {1, 2, 3};
		final Date magicDate = new Date(123456789);
		testObj = new SomeClass(magicNumber);
		expectedResult = "getFoo (int) " + magicNumber + String.format("%n") +
								  "foo (int) " + magicNumber + String.format("%n") +
								  "array (int[]) " + Arrays.toString(magicArray) + String.format("%n") +
								  "date (Date) " + magicDate + String.format("%n");
		renderer = new Renderer(testObj);
	}*/
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new SomeClass(20), "getFoo (int) " + 20 + String.format("%n") +
				  "foo (int) " + 20 + String.format("%n") +
				  "array (int[]) " + Arrays.toString(MAGIC_ARRAY) + String.format("%n") +
				  "date (Date) " + MAGIC_DATE + String.format("%n") },
			{new SomeClass(30), "getFoo (int) " + 30 + String.format("%n") +
			  "foo (int) " + 30 + String.format("%n") +
			  "array (int[]) " + Arrays.toString(MAGIC_ARRAY) + String.format("%n") +
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
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
