package arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int []marks = {75,85,95,32,45,96};
		
		int n = marks.length;
		Arrays.sort(marks);
		

		System.out.println("second largest number"+marks[n-2]);
	}

}
