package test.constructorcall2;

public class ClsB extends ClsA{
	
	public ClsB(){
		System.out.println("ClsB�� �⺻�������Դϴ�.");
	}
	
	public ClsB(int n) {
		super(n);
		System.out.println("ClassB(int n)�� ������ ȣ��");
	}
}
