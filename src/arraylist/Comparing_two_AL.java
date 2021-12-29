package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparing_two_AL {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A","B","C","D","T"));
		
		//sorting into ascending oder
				Collections.sort(ar);
				Collections.sort(ar1);
     //Returns true if elements are same and returns false when elements are not same	
				System.out.println(ar.equals(ar1)); 	
				
				/*
				 * finding out additional element
				 */	
		ar.removeAll(ar1);
		System.out.println(ar); 
		
		/*
		 * finding out common element
		 */
		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("A","B","C","D","T"));
		ar5.retainAll(ar6);
		System.out.println(ar5);;

	}

}
