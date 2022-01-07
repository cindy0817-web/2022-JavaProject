package test.this1;

public class RunThisTest1 {

	public static void main(String[] args) {
		ThisTest1 t1 = new ThisTest1();
		t1.power(5);
		
		int x = 2, y = 3;
		System.out.printf("%d의 %d제곱은 %d입니다.", x, y, t1.power(x,y));

	}

}
