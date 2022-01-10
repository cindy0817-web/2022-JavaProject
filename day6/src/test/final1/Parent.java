package test.final1;

public class Parent {
//	final 필드는 초기화된 값만 사용할 수 있고, 변경이 불가능하다. (필드 값 변경 금지)
//	identifier -> API 이름 붙이는 규칙 참고(개발자)
//	보통 static과 final을 같이 씀
	public static final int REST_TIME = 10;
	
	
	public final void rest() {
//		restTime = 20;
		System.out.println(REST_TIME + "분간 휴식을 한다.");
	}
}
