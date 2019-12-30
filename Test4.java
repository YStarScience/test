
/*
 * 	作业4：for语句练习
	输出所有的水仙花数，所谓水仙花数是指一个3
   	位数，其各个位上数字立方和等于其本身。
   	例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

 */

public class Test4 {
	public static void main(String[] args) {
		System.out.println("所有水仙花数为：");
		for(int i = 1;i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					int left = i*100 + j*10 + k;
					int right = i*i*i +j*j*j +k*k*k;
					if(left == right) {
						System.out.println(left);
					}
				}
				
			}
		}
		
	}

}
