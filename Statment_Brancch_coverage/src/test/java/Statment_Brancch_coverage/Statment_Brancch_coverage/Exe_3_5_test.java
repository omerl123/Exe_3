package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import statusClass.status;


public class Exe_3_5_test {
	@Test
	public void path_1() {
	double Cart = 1_800.00;
    int Credit_Rating = 600;
    status Status = null;
    boolean expected = false;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_2() {
	double Cart = 1_700.00;
    int Credit_Rating = 900;
    status Status = null;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_3() {
	double Cart = 1_200.00;
    int Credit_Rating = 500;
    status Status = null;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_4() {
	double Cart = 2_600.00;
    int Credit_Rating = 650;
    status Status = status.silver;
    boolean expected = false;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_5() {
	double Cart = 3_200.00;
    int Credit_Rating = 950;
    status Status = status.silver;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_6() {
	double Cart = 2_300.00;
    int Credit_Rating = 900;
    status Status = status.silver;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_7() {
	double Cart = 4_200.00;
    int Credit_Rating = 320;
    status Status = status.gold;
    boolean expected = false;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_8() {
	double Cart = 5_400.00;
    int Credit_Rating = 700;
    status Status = status.gold;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }
	@Test
	public void path_9() {
	double Cart = 2_900.00;
    int Credit_Rating = 1500;
    status Status = status.gold;
    boolean expected = true;
    boolean result = Exe_3_5.checkOut(Cart, Credit_Rating, Status);
    assertEquals(expected,result);
    }

}
