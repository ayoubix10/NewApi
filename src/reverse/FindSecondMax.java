package reverse;

public class FindSecondMax {

	public static void main(String[] args) {

		
		int [] x = {100,200,300,400,25,500};
		
		int maxOne = 1;
		int maxTwo = 1;
		int maxThree = 1;
		
		for (int i=0; i<x.length-1; i++) {
			
			if (maxOne<x[i]) {
				maxThree=maxTwo;
				maxTwo=maxOne;
			maxOne=x[i];
		}
		
		else if (maxTwo<x[i]) {
			maxThree=maxTwo;
			maxTwo=x[i];
		
	}
		else if(maxThree<x[i])
			maxThree=x[i];

	
	System.out.println(maxOne);
	System.out.println(maxTwo);
	System.out.println(maxThree);
}
	
}
}