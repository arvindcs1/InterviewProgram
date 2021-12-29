package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemovingDuplicateFromAL {

	public static void main(String[] args) {
		/*
		 * How to Removing_Duplicate_fromArrayList
		 */
		//Rule 1 //Create an arrayList
			ArrayList<Integer> abc = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3,4,5,6,4,5,6));

			//Rule2 //Converting it into LinkedHash Set
			LinkedHashSet<Integer> lHs= new LinkedHashSet<Integer>(abc);
			
			//Rule 3 //Converting the  LinkedHash Set into ArrayList 
			ArrayList<Integer> ghi = new ArrayList<Integer>(lHs);
			
			//printing
			 System.out.println(ghi);
			
	}

}
