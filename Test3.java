

import java.util.Scanner;

/*
 * 1��ҵ3��switch�����ϰ
	3.��������ָ���·ݣ���ӡ���·������ļ��ڡ�
	3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����

 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
//		default:
//			System.out.println("������������������롣");
//			break;
		}
	}

}
