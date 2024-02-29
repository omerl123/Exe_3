package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakClass3_A {
	
	 @Test
		public void weaktest3_1_1(){
	        int a = 9;
	        int b = 5;
	        
	     
	        int expected =14;
	        int result = WeakClass.WeakMethod3(a, b);
	        assertEquals(expected, result,0.001);
	        
	        
	    }
	    
	    @Test
	    public void weaktest3_1_2() {
	    	int a = 5;
	    	int b = 5;
	    	
	    	 int expected =1;
	    	 int result = WeakClass.WeakMethod3(a, b);
	    	 assertEquals(expected,result);
	    
	    }

}
