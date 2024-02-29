package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	public static int WeakMethod1(int a, int b) {
		int result;
		if ((a > 3 )|| (b == 10)) {
			result = b/a;	 
		}
		else {
		 result=b-a;
	 	}
		return result;
		
		
		
	}
	public static int WeakMethod2(int a, int b) {
		int result;
		 if ((a == 2 )|| (b > 10)) {
				result = b/a;	 
		 }
		 else {
			 result=b+a+1;
		 }
		 return result;
		
		
	}
	public static int WeakMethod3(int a, int b) {
		int result;
		if ((a == 5 )|| (b > 6)) {
			result = a/b;	 
		}
		else {
		 result = a+b;
	 	}
		return result;
		
		
		
	}
	public static int WeakMethod4(int a,int b) {
		int result;
		if ((a>5) || (b<10)) {
			result = a+b;
		}
		else {
			result = a-b;
		}
		return result;
	}


}
