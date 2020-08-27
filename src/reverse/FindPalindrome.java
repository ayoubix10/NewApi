package reverse;

public class FindPalindrome {

	public static void main(String[] args) {

		String name = "madam";
		String reverse="";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
			
		}
		if(name.equalsIgnoreCase(reverse))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
	}

}
