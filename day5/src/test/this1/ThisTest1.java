package test.this1;

public class ThisTest1 {
	
	private int n;
	
	public void  power(int n) {
		this.n = n * n;
		System.out.printf("%d�� ������ %d�̴�.\n", n, this.n);
	}
	
}
