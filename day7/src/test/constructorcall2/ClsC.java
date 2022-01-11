package test.constructorcall2;

public class ClsC extends ClsB{
	
	public ClsC(){
		System.out.println("ClsC의 기본생성자입니다.");
	}
	
	public ClsC(int n) {
		super(n);
		System.out.println("ClassC(int n)의 생성자 호출");
	}
}
