package test.constructorcall2;

public class ClsB extends ClsA{
	
	public ClsB(){
		System.out.println("ClsB의 기본생성자입니다.");
	}
	
	public ClsB(int n) {
		super(n);
		System.out.println("ClassB(int n)의 생성자 호출");
	}
}
