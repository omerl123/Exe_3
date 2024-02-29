package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakClass2_A {
	@Test(expected=java.lang.ArithmeticException.class)
	public void weaktest2_1_1() {
		int a = 0;
        int b = 15;
        
     
        WeakClass.WeakMethod2(a, b);
        
	}

}
