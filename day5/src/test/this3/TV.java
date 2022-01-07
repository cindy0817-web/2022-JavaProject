package test.this3;

public class TV {
	
	private String producer, color;
	private int size;
	
	public String getProducer() {
		return producer;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSize() {
		return size;
	}

	public TV(int size) {
		this.size = size;
		System.out.printf("TV( %d ) »£√‚µ .\n", size);
	}
	
	public TV(int size, String color) {
		this(size);		//ª˝º∫¿⁄ »£√‚
		this.color = color;
		System.out.printf("TV( %d, %s ) »£√‚µ .\n", size, color);
	}
	
	public TV(int size, String color, String producer) {
		this(size, color);
		this.producer = producer;
		System.out.printf("TV( %d, %s, %s ) »£√‚µ .\n", size, color, producer);
	}
}
