package mvc.view;

import java.util.ArrayList;

import mvc.model.Student;

public class ScoreView {
	
	private ArrayList<Student> studentArrList;

	public ScoreView(ArrayList<Student> studentArrList) {
		this.studentArrList = studentArrList;
	} 
	
	public void print() {
		System.out.println("================ MVC 모델링을 기반으로 한 성적 프로그램 ================\n");

		for(int i = 0; i < studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			int sum = calcSum(s);
			double avg = calcAvg(sum);
			System.out.printf("* 성명 : %s  학번 : %d 국어 : %d 영어 : %d 수학 : %d 과학 : %d 역사 : %d 합계 : %d 평균 : %.2f\n",
								s.getName(), s.getStuId(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(), 
								sum, avg );
		}
	}
	
	public int calcSum(Student s) {
		int sum = s.getKor() + s.getEng() + s.getMath() + s.getScience() + s.getHistory();
		return sum;
	}
	
	public double calcAvg(int sum) {
		double avg = sum / 5.0;
		return avg;
	}
	
}
