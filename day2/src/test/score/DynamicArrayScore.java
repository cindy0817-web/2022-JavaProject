package test.score;
import java.util.Scanner;

public class DynamicArrayScore {
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      //입력
      System.out.print("학생수 입력 : ");
      int stuNum = sc.nextInt();
      
      //배열 (점수, 학생수, 합계)
      int[][] scores = new int[stuNum][];
      String[] stuName = new String[stuNum];
      int[] sum = new int[stuNum];

      //입력(이름, 과목수, 과목점수)
      for(int i = 0; i < scores.length; i++) {
    	  System.out.print("** 이름을 입력하세요 : ");
    	  stuName[i] = sc.next();
    	  System.out.print(stuName[i] + " 학생의 과목 수 입력 : ");
    	  int subNum = sc.nextInt();
    	  scores[i] = new int[subNum];
    	  
    	  for(int j = 0; j< scores[i].length; j++) {
    		  System.out.print((j+1) + "과목 점수를 입력하세요 : ");
    		  scores[i][j] = sc.nextInt();
    	  }
      }      
      
      //처리(합계)
      for(int i = 0; i < scores.length; i++)
    	  for(int j = 0; j <scores[i].length; j++)
    		  sum[i] += scores[i][j];
     
     //출력(이름, 점수, 합계, 평균)
     for (int i = 0; i < scores.length; i++) {
    	 System.out.print(stuName[i] + "\t");
    	 for (int j = 0; j <scores[i].length; j++) {
    		 System.out.print(scores[i][j] + "\t");
    	 }
    	 System.out.print("합계 : " + sum[i] + "\t");
		 System.out.printf("평균 : %.1f\n", ((double)sum[i] / scores[i].length));
     }
      
      
      sc.close();
   }
}
