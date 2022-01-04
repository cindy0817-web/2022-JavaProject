package test.score;
import java.util.Scanner;

public class DynamicArrayScore {
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      //�Է�
      System.out.print("�л��� �Է� : ");
      int stuNum = sc.nextInt();
      
      //�迭 (����, �л���, �հ�)
      int[][] scores = new int[stuNum][];
      String[] stuName = new String[stuNum];
      int[] sum = new int[stuNum];

      //�Է�(�̸�, �����, ��������)
      for(int i = 0; i < scores.length; i++) {
    	  System.out.print("** �̸��� �Է��ϼ��� : ");
    	  stuName[i] = sc.next();
    	  System.out.print(stuName[i] + " �л��� ���� �� �Է� : ");
    	  int subNum = sc.nextInt();
    	  scores[i] = new int[subNum];
    	  
    	  for(int j = 0; j< scores[i].length; j++) {
    		  System.out.print((j+1) + "���� ������ �Է��ϼ��� : ");
    		  scores[i][j] = sc.nextInt();
    	  }
      }      
      
      //ó��(�հ�)
      for(int i = 0; i < scores.length; i++)
    	  for(int j = 0; j <scores[i].length; j++)
    		  sum[i] += scores[i][j];
     
     //���(�̸�, ����, �հ�, ���)
     for (int i = 0; i < scores.length; i++) {
    	 System.out.print(stuName[i] + "\t");
    	 for (int j = 0; j <scores[i].length; j++) {
    		 System.out.print(scores[i][j] + "\t");
    	 }
    	 System.out.print("�հ� : " + sum[i] + "\t");
		 System.out.printf("��� : %.1f\n", ((double)sum[i] / scores[i].length));
     }
      
      
      sc.close();
   }
}
