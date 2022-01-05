package test.class2;

public class RunClassAdd {

	public static void main(String[] args) {
		ClassAdd a1 = new ClassAdd();
		ClassAdd a2 = new ClassAdd();
		
		a2.setN1(10);
		a2.setN2(20);
		a2.addNum();
		
		System.out.printf("%d + %d = %d\n", a2.getN1(), a2.getN2(), a2.getResult());
		//System.out.println("a2.result = " + a2.getResult());
		
		a2.setN1(150);
		a2.setN2(200);
		a2.addNum();
		
		System.out.printf("%d + %d = %d\n", a2.getN1(), a2.getN2(), a2.getResult());
		//System.out.println("a2.result = " + a2.getResult());
	}

}
