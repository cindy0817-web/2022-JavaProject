package test.constructorcall2;

public class ClsC extends ClsB{
	
	public ClsC(){
		System.out.println("ClsC�� �⺻�������Դϴ�.");
	}
	
	public ClsC(int n) {
		super(n);
		System.out.println("ClassC(int n)�� ������ ȣ��");
	}
}
