package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakClass4_A {
	@Test
	public void weaktest4_1_1() {
		int a = 6;
	    int b = 11;
	    int expected =17;
   	 	int result = WeakClass.WeakMethod4(a, b);
   	 	assertEquals(expected,result,0.0001);
	    }
	@Test
	public void weaktest4_1_2() {
		int a = 2;
	    int b = 2;
	    int expected =4;
   	 	int result = WeakClass.WeakMethod4(a, b);
   	 	assertEquals(expected,result,0.0001);
	    }
	@Test
	public void weaktest4_1_3() {
		int a = 4;
	    int b = 14;
	    int expected =-10;
   	 	int result = WeakClass.WeakMethod4(a, b);
   	 	assertEquals(expected,result,0.0001);
	    }

}
