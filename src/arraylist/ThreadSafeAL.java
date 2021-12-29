package arraylist;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeAL {

	public static void main(String[] args) {
		/*
		 * Creating a thrad safe ArrayList
		 */
		 CopyOnWriteArrayList<String> abc = new CopyOnWriteArrayList<String>();
		 abc.add("Arvind");
		 abc.add("apple");
		 abc.add("mango");
		 
		 System.out.println(abc);

	}

}
