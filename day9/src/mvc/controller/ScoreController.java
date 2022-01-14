package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.model.Student;
import mvc.view.ScoreView;

public class ScoreController {

	public static void main(String[] args) {
		ArrayList<Student> studentArrList = new ArrayList<Student>();
		Scanner s1 = new Scanner(System.in);	//문자열 입력용
		Scanner s2 = new Scanner(System.in);	//숫자 입력용
		String[] subjects = {"국어", "영어", "수학", "과학", "역사"};
		int[] scores = new int[subjects.length];
		
		while(true) {
			System.out.println("* 학생 정보를 입력해주세요. ");
			System.out.print("성명 : ");
			String name = s1.nextLine();
			System.out.print("학번 : ");
			int stuId = s2.nextInt();
			
			System.out.println("* 학생 성적을 입력해주세요. ");
			
			for(int i = 0; i < subjects.length; i++) {
				System.out.print(subjects[i]+" : ");
				scores[i] = s2.nextInt();
			}
			Student s = new Student(name, stuId, scores[0], scores[1], scores[2], scores[3], scores[4]);
			studentArrList.add(s);
					
			System.out.print("* 다음 학생 정보를 계속 입력하시겠습니까?(y/n) : ");
			String contin = s1.nextLine();
			if(contin.equals("n") ||contin.equals("no"))//문자열은 equals()로 비교!
				break;
		}
		
//		화면에 결과를 출력하기 위해서 ScoreView객체를 생성;
		ScoreView view = new ScoreView(studentArrList);
		view.print();
		
		s1.close();
		s2.close();
	}

}
