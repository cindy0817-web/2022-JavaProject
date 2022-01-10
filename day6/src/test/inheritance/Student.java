package test.inheritance;

public class Student extends Person {
	
	int stuID;	//학번
	int grade;	//학년
	int ban;	//반
	
	public void study() {
		System.out.println(name + "(이)가 공부한다.");
	}
	
	public void play() {
		System.out.println(name + "(이)가 논다.");
	}
	
	
}
