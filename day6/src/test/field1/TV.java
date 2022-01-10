package test.field1;
//
public class TV {
	String color;
	int size;
	public static String PRODUCER = "LGÀüÀÚ";
	
	public TV(String color, int size) {
		this.color = color;
		this.size = size;
	}

	/*public TV(String color) {
		this.color = color;
	}
	
	public TV(int size) {
		this.size = size;
	}*/
	
	public TV() {
		this("»ö±ò ¾øÀ½",0);
	}
	
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}
	
	
}


