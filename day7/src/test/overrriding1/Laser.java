package test.overrriding1;

public class Laser extends Weapon {

	@Override
	public void fire() {
		System.out.println("찌이~잉");
		super.fire();	//weapon클래스의 fire 메소드 실행
	}

}
