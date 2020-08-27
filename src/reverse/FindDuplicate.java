package reverse;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		String sentence = "This this is my MY dup dup text";
				
				String[] dup = sentence.split("\\s");
		
		// System.out.println(Arrays.deepToString(dup));
		
				String myString="";
				for(int i=0;i<dup.length-1;i++){
				if (dup[i].equalsIgnoreCase(dup[i+1]))
				System.out.println(dup[i]+" is a duplicate");
				}
	}

}
