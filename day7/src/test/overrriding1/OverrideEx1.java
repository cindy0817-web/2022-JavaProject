package test.overrriding1;

public class OverrideEx1 {

	public static void main(String[] args) {
		Bomb b = new Bomb();
		Laser l = new Laser();
		Weapon w = new Weapon();
		
		b.fire();
		l.fire();
//		w.fire();

	}
}
