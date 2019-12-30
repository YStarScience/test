

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * 1.1.2	作业2：if语句练习
	由键盘输入三个整数分别存入变量num1、num2、num3，
	对它们进行排序(使用 if-else if-else),并且从小到大输出。
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big;
		int middle;
		int small;
		System.out.println("请输入num1(整数）：");
		int num1 = sc.nextInt();
		System.out.println("请输入num2(整数）：");
		int num2 = sc.nextInt();
		System.out.println("请输入num3(整数）：");
		int num3 = sc.nextInt();
		if(num1 >= num2 && num2 >= num3) {
			System.out.println(num3 + " "+ num2 +" " + num1);
		}else if(num1 >= num3 && num3 >= num2) {
			System.out.println(num2 + " "+ num3 +" " + num1);
		}else if(num2 >= num1 && num1 >= num3) {
			System.out.println(num3 + " "+ num1 +" " + num2);
		}else if(num2 >= num3 && num3 >= num1) {
			System.out.println(num1 + " "+ num3 +" " + num2);
		}else if(num3 >= num2 && num2 >= num1) {
			System.out.println(num1 + " "+ num2 +" " + num3);
		}else {
			System.out.println(num2 + " "+ num1 +" " + num3);
		}

	}

}
