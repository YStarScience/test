
/* 
 * 	1.1.1	作业1：if语句练习
 	从键盘输入小明的期末成绩。
?	当成绩为100分时，奖励一辆BMW；
?	当成绩为（80，99]时，奖励一个台iphone5s；
?	当成绩为[60,80]时，奖励一本参考书；
?	其它时，什么奖励也没有。

 */

import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int grade = sc.nextInt();
		if(grade == 100) {
			System.out.println("奖励一辆BMW");
		}else if (grade > 80 && grade <= 99) {
			System.out.println("奖励一个台iphone5s");			
		}else if (grade > 60 && grade <= 79) {
			System.out.println("奖励一本参考书");			
		}else {
			System.out.println("什么奖励也没有");			
		}
	}

}
