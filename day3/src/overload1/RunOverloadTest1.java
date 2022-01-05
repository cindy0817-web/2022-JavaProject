package test.overload1;

public class RunOverloadTest1 {

	public static void main(String[] args) {
		OverloadTest1 ot1 = new OverloadTest1();
		
		ot1.calc(100,200);
		ot1.calc(10, 20, 50);
		
		System.out.println("ot1.calc(100,200) 결과 : " + ot1.getResult1());
		System.out.println("ot1.calc(10, 20, 50) 결과 : " + ot1.getResult2());
	}

}
