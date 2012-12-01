package test;

import main.TestSubject_v2;
import junit.framework.TestCase;


public class Task_v2_3_test extends TestCase {

	public void testSubtraction(){
		TestSubject_v2 ts = new TestSubject_v2();
		ts.setAtt1(5);
		ts.setAtt2(3);
		
		assertEquals(2, ts.sub());
	}
	
}
