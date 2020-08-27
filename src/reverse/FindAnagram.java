package reverse;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {

		
	String text1 = "SAVE";
	String text2 = "VASE";
	
	char[] t1Array = text1.toCharArray();
	char[] t2Array = text2.toCharArray();
	
	Arrays.sort(t1Array);
	Arrays.sort(t2Array);
	
	if(Arrays.equals(t1Array, t2Array))
		System.out.println("Anagram");
	else
		System.out.println("Not an Anagram");
	
	}

}
