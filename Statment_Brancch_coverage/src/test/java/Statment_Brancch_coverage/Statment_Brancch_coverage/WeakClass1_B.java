package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakClass1_B {
	
	
    @Test
	public void weaktest1_2_1(){
        int a = 4;
        int b = 12;
        
     
        int expected =3;
        int result = WeakClass.WeakMethod1(a, b);
        assertEquals(expected, result,0.001);
        
        
    }
    
    @Test
    public void weaktest1_2_2() {
    	int a = 2;
    	int b = 8;
    	
    	 int expected =6;
    	 int result = WeakClass.WeakMethod1(a, b);
    	 assertEquals(expected,result,0.0001);
    
    }

}
