package test.phone.interface1;

public interface SmartPhone extends MobilePhone, MP3 {
   
	void installApp(String appName);
	void runAPP(String appName);
}
