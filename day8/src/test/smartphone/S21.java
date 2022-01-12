package test.smartphone;

import test.phone.interface1.SmartPhone;

public class S21 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber + "로 전화를 건다.");
	}

	@Override
	public void recieveCall(String phoneNumber) {
		System.out.println(phoneNumber + "에서 걸려 온 전화를 받는다.");
	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber + "로 문자메시지를 보낸다.");
	}

	@Override
	public void receiveSMS(String phoneNumber) {
		System.out.println(phoneNumber + "에서 온 문자메시지를 받는다.");
	}

	@Override
	public String searchMusic(String searchWords) {
		System.out.println("음악을 찾는 중입니다.");
		return searchWords + "_music.mp3";
	}

	@Override
	public void playMusic(String musicName) {
		System.out.println(musicName + "음악을 재생합니다.");

	}

	@Override
	public void stopMusic() {
		System.out.println("실행중인 음악을 중지합니다.");
	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName + "앱을 인스톨합니다.");
	}


	@Override
	public void runAPP(String appName) {
		System.out.println(appName + "앱을 실행합니다.");
		
	}

}