package test.overrriding1;

public class Laser extends Weapon {

	@Override
	public void fire() {
		System.out.println("����~��");
		super.fire();	//weaponŬ������ fire �޼ҵ� ����
	}

}
