package test;

import java.util.Scanner;

public class ScoreTest {

   public static void main(String[] args) {
	   
      int[][] scores = new int[8][];
      int [] count = new count[5];
      
      Scanner sc = new Scanner(System.in);

      int count = 0;
      for(int i = 0; i < scores.length; i++) {
    	  System.out.print("�̸��� �Է��ϼ��� : ");
    	  scores[i][0] = sc.nextInt();
    	  System.out.print("�����ϴ� ���� �� �Է��ϼ��� : ");
    	  count = sc.nextInt();
    	  scores[i] = new int[count];
    	  
    	  for(int j = 1; j< scores[i].length; j++) {
    		  System.out.print(j + "������ �Է��ϼ��� : ");
    		  scores[i][j] = sc.nextInt();
    	  }
      }
      
      int sum = 0;
//      �迭�� ���� ��ŭ ���� ������ �Է� �޾Ƽ� �����ϰ� ��ü�հ踦 ���Ѵ�.
      for(int i = 0; i < scores.length; i++) {
    	  for(int j = 0; j< scores[i].length; j++) {
    		  
    	  }
    	 }
      for (int i = 0; i < scores.length; i++) {
         System.out.print((i + 1) + "���� ���� �Է� : ");
         scores[i] = sc.nextInt();
         sum += scores[i];
      }
      System.out.println("���հ� : "+sum);
      double avg = (double)sum / scores.length;
//      System.out.printf("���: %.2f\n", avg);  // �Ҽ��� �ڸ��� ���� ���� 
      System.out.println("��� : " + avg);//�ڸ����� ������ ���´�.
      sc.close();
   }//main
}
