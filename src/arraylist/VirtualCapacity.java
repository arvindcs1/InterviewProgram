package arraylist;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add(10);
		
		System.out.println(ar.size());

	}

}
