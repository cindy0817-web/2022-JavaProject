package test.arraylist;

import java.util.ArrayList;

//ArrayList�� java.util ��Ű���� Ŭ�����̴�.
public class ArrayListTest {
	
	public static void main(String args[]) {
//		�迭�� ���ѵ� ������ ��������� ���(�迭��ü ������ �� ���� ���ϱ� ������)
//		ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ��������� �߰�(add)�ؼ� ����� �� �ִ�.
//		ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ��������� ����(remove)�ؼ� ����� �� �ִ�.
		
//		ArrayList ��ü ���� : GenericType(����� ����� �ڷ��� ����) <>
		ArrayList<String> arrList = new ArrayList<String>();
//		ArrList�� �����͸� �߰��Ѵ�.
		arrList.add("������");
		arrList.add("�輭��");
		arrList.add("������");
		arrList.add("�ΰ���");
		arrList.add("��ٿ�");
		arrList.add("�̿���");
		arrList.add("������");
		arrList.add("���ֿ�");
		
		arrList.remove(6);
		arrList.remove("�ΰ���");
		arrList.add("�μҸ�");
		
		
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
}
