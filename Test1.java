
/* 
 * 	1.1.1	��ҵ1��if�����ϰ
 	�Ӽ�������С������ĩ�ɼ���
?	���ɼ�Ϊ100��ʱ������һ��BMW��
?	���ɼ�Ϊ��80��99]ʱ������һ��̨iphone5s��
?	���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
?	����ʱ��ʲô����Ҳû�С�

 */

import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int grade = sc.nextInt();
		if(grade == 100) {
			System.out.println("����һ��BMW");
		}else if (grade > 80 && grade <= 99) {
			System.out.println("����һ��̨iphone5s");			
		}else if (grade > 60 && grade <= 79) {
			System.out.println("����һ���ο���");			
		}else {
			System.out.println("ʲô����Ҳû��");			
		}
	}

}
