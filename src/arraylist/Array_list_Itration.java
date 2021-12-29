package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_Itration {

	public static void main(String[] args) {
		/*
		 * Itration over arraylist
		 */
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Arvind");
		ar.add("mama");
		ar.add("kav");
		ar.add("mummy");
		ar.add("papa");
		
		System.out.println(ar);
		
		//by using for looop
		
		System.out.println("=========================== Using for loop");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("=========================== by the use of itrator class");
		//with the help of itrator class 
		Iterator<String>  it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
