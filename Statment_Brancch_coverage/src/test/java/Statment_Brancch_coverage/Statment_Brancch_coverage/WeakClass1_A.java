package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakClass1_A {

	@Test(expected=java.lang.ArithmeticException.class)
	public void weaktest1_1() {
	int a = 0;
    int b = 10;
    WeakClass.WeakMethod1(a, b);
    }
}
