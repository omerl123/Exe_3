package Statment_Brancch_coverage.Statment_Brancch_coverage;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakClass3_B {
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void weaktest3_2_1() {
	int a = 5;
    int b = 0;
    WeakClass.WeakMethod3(a, b);
    }
	@Test
	public void weaktest3_2_2() {
		int a = 16;
	    int b = 8;
	    int expected =2;
   	 	int result = WeakClass.WeakMethod3(a, b);
   	 	assertEquals(expected,result,0.0001);
	    }
	
	@Test
	public void weaktest3_2_3() {
		int a = 9;
	    int b = 3;
	    int expected =12;
   	 	int result = WeakClass.WeakMethod3(a, b);
   	 	assertEquals(expected,result,0.0001);
	    }

	
	
}
