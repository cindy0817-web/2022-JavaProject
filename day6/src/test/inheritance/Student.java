package test.inheritance;

public class Student extends Person {
	
	int stuID;	//�й�
	int grade;	//�г�
	int ban;	//��
	
	public void study() {
		System.out.println(name + "(��)�� �����Ѵ�.");
	}
	
	public void play() {
		System.out.println(name + "(��)�� ���.");
	}
	
	
}
