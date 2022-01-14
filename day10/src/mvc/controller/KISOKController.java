package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;
import mvc.vo.OrderMenuVO;

public class KISOKController {
	
	public void selectMenuPrint() {
		System.out.println("*************** 선택 메뉴 종류 ***************");
		System.out.println("1. 떡볶이\t2. 쫄면\t3. 순대\t4.튀김\t5. 김밥");
		System.out.println("******************************************");
	}

	public static void main(String[] args) {
		ArrayList <OrderMenuVO> orderMenuArrList = new ArrayList<OrderMenuVO>();
		Scanner sc = new Scanner(System.in);
		
		selectMenuPrint();

		while(true) {
			System.out.println("분식집에 오신것을 환영합니다~");
			System.out.print("예약번호 : ");
			System.out.print("메뉴(1.2.3.)");
			System.out.print("가격");
			
			
		}
	}

}
