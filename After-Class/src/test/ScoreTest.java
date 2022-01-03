package test;

import java.util.Scanner;

public class ScoreTest {

   public static void main(String[] args) {
//      성적을 저장할 수 있는 1차원 배열 선언 및 객체생성 
      int[] scores = new int[5];
//    int[] scores2 = {95, 97, 88, 87, 89};
      
//     keyboard로부터 성적을 입력 받기 위해 Scanner 객체 생성
      Scanner s = new Scanner(System.in);

      int sum = 0;
//      배열의 길이 만큼 과목별 성적을 입력 받아서 저장하고 전체합계를 구한다.
      for (int i = 0; i < scores.length; i++) {
         System.out.print((i + 1) + "과목 성적 입력 : ");
         scores[i] = s.nextInt();
         sum += scores[i];
      }
      System.out.println("총합계 : "+sum);
      double avg = (double)sum / scores.length;
//      System.out.printf("평균: %.2f\n", avg);  // 소수점 자리수 지정 가능 
      System.out.println("평균 : " + avg);//자리수가 끝가지 나온다.
      s.close();
   }//main
}
