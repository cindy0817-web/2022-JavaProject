package test.class1;

public class TV{
	
	private String color;
	private int size;
	private String producer;
	private int channel, volume;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	public void powerOn(){
		System.out.println(producer + " TV 전원이 켜짐");
	}
	
	public void powerOff(){
		System.out.println(producer + " TV 전원이 꺼짐");
	}
	
	public void upChannel(){
		channel++;
		System.out.println("현재 채널은 " + channel + "번");		
	}
	
	public void downChannel() {
		channel--;
		System.out.println("현재 채널은 " + channel + "번");
	}
	
	public void upVolume() {
		volume++;
		System.out.println("현재 볼륨은 " + volume);
	}
	
	public void downVolume() {
		volume--;
		System.out.println("현재 볼륨은 " + volume);
	}	
	
	@Override
	public String toString() {
		return "TV [color=" + color + ", size=" + size + ", producer=" + producer + ", channel=" + channel + ", volume="
				+ volume + "]";
	}

}

