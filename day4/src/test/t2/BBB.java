package test.t2;

import test.t1.MainTest;

//MainTest와 다른 패키지
public class BBB {
	
	public void acccessTest() {
		MainTest mt = new MainTest();
//		다른 패키지에서는public만 가능
		System.out.println(mt.n1);
//		System.out.println(mt.n2);
//		System.out.println(mt.n3);
//		System.out.println(mt.n4);
	}
}
