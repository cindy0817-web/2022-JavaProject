package p2;

import p1.Parent;

public class Child extends Parent {
// ��Ӱ��϶��� �ٸ� ��Ű���� �ִ� �θ��� ����� ������ �� �ִ�.
	public void testProtected() {
		num1 = 100;
		System.out.println("Parent�� protected field num1 :  " + num1);
		System.out.println();
	}
	
	public static void mai(String args[]) {
		Child c = new Child();
		c.testProtected();
	}
}
