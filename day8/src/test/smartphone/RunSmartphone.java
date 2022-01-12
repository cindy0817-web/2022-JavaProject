package test.smartphone;

public class RunSmartphone {
	
	public static void main(String[] args) {
		
		S21 s = new S21();
		s.sendCall("010-3333-7777");
		s.receiveSMS("010-5555-1111");
		s.installApp("Google Map");
		s.runAPP("Google Map");
		String music = s.searchMusic("DNA");
		s.playMusic(music);
		s.stopMusic();
	}
}
