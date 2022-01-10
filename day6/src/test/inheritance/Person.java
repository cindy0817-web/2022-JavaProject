package test.inheritance;

public class Person {
	
	String name;
	double weight, height;
	String addr;
	
	public void walk() {
		System.out.println(name + "(이)가 걷는다.");
	}
	
	public void sleep() {
		System.out.println(name + "(이)가 잔다.");
	}
	
	public void wakeUp() {
		System.out.println(name + "(이)가 깬다.");
	}
	
	public void eat() {
		System.out.println(name + "(이)가 먹는다.");
	}
}
