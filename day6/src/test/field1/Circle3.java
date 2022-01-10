package test.field1;

public class Circle3 {
	static double pi = 3.14;
	double r, circum, area;
	void CircleCalc(double r) {
		this.r = r;
		circum = 2 * pi * r;
		area = pi * r *r;
		ShowResult(this);
	}
	void ShowResult(Circle3 c) {
		System.out.println("반지름이 " + c.r + "인 원의 둘레는 " + c.circum + "면적은 " + c.area);
	}
}
