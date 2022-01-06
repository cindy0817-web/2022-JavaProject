package test.oveload;

public class MethodOverloadTest {
		
// Method Overloading은 동일한 이름을 갖는 메소드를 의미한다.
// 매개변수의 개수는 같고 자료형이 다른 오버로딩
		public int calc(int n1, int n2) {
			return n1 + n2;
		}
		
		public double calc(double n1, double n2) {
			return n1 * n2;
		}
}
