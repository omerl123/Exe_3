package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.*;



public class WeakClass2_B{ 

    @Test
	public void weaktest2_2_1(){
        int a = 3;
        int b = 12;
        
     
        int expected =4;
        int result = WeakClass.WeakMethod2(a, b);
        assertEquals(expected, result,0.001);
        
        
    }
    
    @Test
    public void weaktest2_2_2() {
    	int a = 5;
    	int b = 9;
    	
    	 int expected =15;
    	 int result = WeakClass.WeakMethod2(a, b);
    	 assertEquals(expected,result,0.0001);
    
    }
    @Test
    public void weaktest2_2_3() {
    	int a = 2;
    	int b = 6;
    	
    	 int expected =3;
    	 int result = WeakClass.WeakMethod2(a, b);
    	 assertEquals(expected,result,0.0001);
    
    }
    
}
