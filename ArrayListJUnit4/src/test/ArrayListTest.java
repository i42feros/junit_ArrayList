package test;

import org.junit.*;
import org.junit.runner.Result;
import java.util.ArrayList;

public class ArrayListTest {
	private ArrayList<String> myList;  // Test fixtures
	
	//Initialize test fixtures before each test method
	@Before
	public void init(){
		myList = new ArrayList<String>();
		myList.add("alpha");  // at index 0
		myList.add("beta");	  // at index 1
	}
	
	//Test method to test the insertion operation
	@Test
	public void insertTest(){
		// assertEquals(String message, long expected, long actual)
		Assert.assertEquals("wrong size", 2, myList.size());
		myList.add(1, "john");
		Assert.assertEquals("wrong size", 3, myList.size());
		// assertEquals(String message, Object expected, Object actual)
	    // Use String.equals() for comparison
		Assert.assertEquals("wrong element", "alpha", myList.get(0));
		Assert.assertEquals("wrong element", "john", myList.get(1));
		Assert.assertEquals("wrong element", "beta", myList.get(2));
	}
	
	//Test method to test the replace operation
	@Test
	public void replaceTest(){
		Assert.assertEquals("wrong size", 2, myList.size());
		myList.set(1, "john");
		Assert.assertEquals("wrong size", 2, myList.size());
		Assert.assertEquals("wrong element", "alpha", myList.get(0));
		Assert.assertEquals("wrong element", "john", myList.get(1));
	}
	
	public static void main(String[] args){
		Result r = org.junit.runner.JUnitCore.runClasses(ArrayListTest.class);
		System.out.println(r.wasSuccessful());
	}
}
