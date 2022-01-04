package test;

import java.util.Scanner;

public class ScoreTest {

   public static void main(String[] args) {
	   
      int[][] scores = new int[8][];
      int [] count = new count[5];
      
      Scanner sc = new Scanner(System.in);

      int count = 0;
      for(int i = 0; i < scores.length; i++) {
    	  System.out.print("이름을 입력하세요 : ");
    	  scores[i][0] = sc.nextInt();
    	  System.out.print("수강하는 과목 수 입력하세요 : ");
    	  count = sc.nextInt();
    	  scores[i] = new int[count];
    	  
    	  for(int j = 1; j< scores[i].length; j++) {
    		  System.out.print(j + "과목을 입력하세요 : ");
    		  scores[i][j] = sc.nextInt();
    	  }
      }
      
      int sum = 0;
//      배열의 길이 만큼 과목별 성적을 입력 받아서 저장하고 전체합계를 구한다.
      for(int i = 0; i < scores.length; i++) {
    	  for(int j = 0; j< scores[i].length; j++) {
    		  
    	  }
    	 }
      for (int i = 0; i < scores.length; i++) {
         System.out.print((i + 1) + "과목 성적 입력 : ");
         scores[i] = sc.nextInt();
         sum += scores[i];
      }
      System.out.println("총합계 : "+sum);
      double avg = (double)sum / scores.length;
//      System.out.printf("평균: %.2f\n", avg);  // 소수점 자리수 지정 가능 
      System.out.println("평균 : " + avg);//자리수가 끝가지 나온다.
      sc.close();
   }//main
}
