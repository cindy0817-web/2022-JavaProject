package test.overload1;

public class OverloadTest1 {
	private int result1, result2;

	public int getResult1() {
		return result1;
	}
	
	public int getResult2() {
		return result2;
	}
	
	public void calc(int n1, int n2) {
		result1 = n1 * n2;
	}
	
	public void calc(int n1, int n2, int n3) {
		result2 = n1 + n2 + n3;
	}
	public void calc(double n1, double n2) {
		result2 = n1 * n2;
	}
}
