
/*
 * 	��ҵ4��for�����ϰ
	������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3
   	λ���������λ�����������͵����䱾��
   	���磺 153 = 1*1*1 + 3*3*3 + 5*5*5

 */

public class Test4 {
	public static void main(String[] args) {
		System.out.println("����ˮ�ɻ���Ϊ��");
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
