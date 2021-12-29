package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodsOnAL {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Arvind");
		ar.add("mama");
		ar.add("kav");
		ar.add("mummy");
		ar.add("papa");
		
//		arraylist 2
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Maths");
		ar2.add("Science");
		
		//Add the value of arraylist 2 to arraylist 1
//		ar.addAll(ar2);
//		System.out.println(ar);
		//Add the value of arraylist 2 to arraylist 1 from index 2
		ar.addAll(2, ar2);
		System.out.println(ar);
		//Output [Arvind, mama, Maths, Science, kav, mummy, papa]
		
		//claer he arrayList
//		ar.clear();
//		System.out.println(ar);
		
		//clone method is used to make new arrayList by the use of arraylist 1
		ArrayList<String> cloneList=	(ArrayList<String>)ar.clone();
		System.out.println(cloneList);
		
		//arrayList3 
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("Java","testing","Mantrainece","Dev", "Java"));
		System.out.println(ar3.indexOf("Java"));
		
		System.out.println(ar3.lastIndexOf("Java"));
		ar3.remove("testing");
		System.out.println(ar3);
		
		//to remove if the number is even in list
		ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ar4.removeIf(num -> num%2!=0);
		System.out.println(ar4);

		ArrayList<String> ar3list = new ArrayList<String>(Arrays.asList("Java","testing","Mantrainece","Dev", "Java"));
		ar3list.retainAll(Collections.singleton("Java"));
		System.out.println(ar3list);
		
		//creating a sublist  from list
		ArrayList<Integer> ar5 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> ar5_sublist = new ArrayList<Integer>(ar5.subList(4, 10));
		System.out.println(ar5_sublist);
		
		//coneveting the arrayList  in array
		ArrayList<String> ar3list1 = new ArrayList<String>(Arrays.asList("Java","testing","Mantrainece","Dev", "Java"));
		Object arr[]=ar3list1.toArray();
		//traversing through the array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);

	}

}
}