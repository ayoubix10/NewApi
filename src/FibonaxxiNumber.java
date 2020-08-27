
public class FibonaxxiNumber {

	public static void main(String[] args) {

		//1,2,3,5,8,13,21,34,55,89....
		
		int f1=0;
		int f2=1;
		int f3;
		
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i=2; i<=30; i++) {
			f3=f1+f2;
			System.out.println(f3);
			
			f1=f2;
			f2=f3;
		}
	}

}
