package test.oveload;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodOverloadTest ot = new MethodOverloadTest();
		
		System.out.println("==== 두 수의 덧셈 ====");
		System.out.print("정수 1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.println("==== 두 수의 곱셈 ====");
		System.out.print("실수 1 입력 : ");
		Double n3 = sc.nextDouble();
		System.out.print("실수 2 입력 : ");
		Double n4 = sc.nextDouble();
		
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));

		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));

	}

}
