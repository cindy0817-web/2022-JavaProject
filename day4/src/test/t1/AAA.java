package test.t1;

//MainTest와 같은 패키지
public class AAA {
		public void accessTest() {
			MainTest mt = new MainTest();
//			같은 패키지일 때는 private만 빼고 모두 접근 가능
			System.out.println(mt.n1);
//			System.out.println(mt.n2);
			System.out.println(mt.n3);
			System.out.println(mt.n4);
		}
}
