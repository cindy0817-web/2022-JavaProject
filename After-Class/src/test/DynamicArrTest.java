package test;

public class DynamicArrTest {

	public static void main(String[] args) {
//		int [][] nums = {{10}, {20, 30}, {40,50, 60}};
		int [] [] nums = new int[3][];
		
		int count = 1;
		for (int i = 0; i<nums.length; i++) {
			nums[i] = new int[i+1];
			for (int j = 0; j < nums[i].length; j++) 
				nums[i][j] = count++ * 10;
			
		}
	}

}
