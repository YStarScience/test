
/*
 * 	×÷Òµ5£º´òÓ¡Ê¥µ®Ê÷
    		*
			*** 
			*****
			*******
			*********

 */
public abstract class Test5 {

	public static void main(String[] args) {
		int m = 10;
		int n = 10;
		for(int i=m;i>0;i-=2){
			for(int j=0;j<n;j++){
				if(i/2<=j&&m-i/2>=j)
					{System.out.print("*");}
				else
					{System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
