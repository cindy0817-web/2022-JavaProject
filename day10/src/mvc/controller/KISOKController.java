package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;
import mvc.vo.OrderMenuVO;

public class KISOKController {
	
	public void selectMenuPrint() {
		System.out.println("*************** ���� �޴� ���� ***************");
		System.out.println("1. ������\t2. �̸�\t3. ����\t4.Ƣ��\t5. ���");
		System.out.println("******************************************");
	}

	public static void main(String[] args) {
		ArrayList <OrderMenuVO> orderMenuArrList = new ArrayList<OrderMenuVO>();
		Scanner sc = new Scanner(System.in);
		
		selectMenuPrint();

		while(true) {
			System.out.println("�н����� ���Ű��� ȯ���մϴ�~");
			System.out.print("�����ȣ : ");
			System.out.print("�޴�(1.2.3.)");
			System.out.print("����");
			
			
		}
	}

}
