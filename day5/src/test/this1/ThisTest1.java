package test.this1;

public class ThisTest1 {
	
	private int n;
	
	public void  power(int n) {
		this.n = n * n;
		System.out.printf("%d의 제곱은 %d이다.\n", n, this.n);
	}
	
	public int power(int x, int y){
		n = 1;
		
		for(int i = 1; i <= y; i++) {
			n *= x;
		}
		return n;
	}
}
