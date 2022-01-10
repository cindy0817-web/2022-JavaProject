package test.field1;

public class RunTV {

	public static void main(String[] args) {
		TV t1 = new TV("Black", 55);
		TV t2 = new TV("Silver", 65);
		TV t3 = new TV("Blue", 100);
		
		System.out.printf("색상 : %s, 크기 : %d, 제조사 : %s\n", t1.color, t1.size, TV.PRODUCER);
		System.out.printf("색상 : %s, 크기 : %d, 제조사 : %s\n", t2.color, t2.size, TV.PRODUCER);
		System.out.printf("색상 : %s, 크기 : %d, 제조사 : %s\n", t3.color, t3.size, TV.PRODUCER);
	}

}
