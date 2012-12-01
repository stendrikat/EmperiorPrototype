package test;

import main.TestSubject_v1;
import junit.framework.TestCase;


public class Task_v1_1_test extends TestCase {

	public void testAddition(){
		TestSubject_v1 ts = new TestSubject_v1();
		ts.setAtt1(2);
		ts.setAtt2(3);
		
		assertEquals(5, ts.sum());
	}
	
}
