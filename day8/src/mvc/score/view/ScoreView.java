package mvc.score.view;

import java.util.ArrayList;
import mvc.score.model.Student;

public class ScoreView {
	private ArrayList<Student> studentArrList;

	public ScoreView(ArrayList<Student> studentArrList) {
		this.studentArrList = studentArrList;
	} 
	
	public void print() {
		System.out.println("================ MVC 모델링을 기반으로 한 성적 프로그램 ================\n");

		for(int i = 0; i < studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			System.out.printf("* 성명 : %s  학번 : %d 국어 : %d 영어 : %d \n");
		}
	}
}
