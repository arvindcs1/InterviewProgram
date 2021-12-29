package arrays;

public class SortedorNot {

	public static void main(String[] args) {
//		int []arr = {11,2,43,4,5,66};
		int []arr = {1,2,3,4,5,6};
		boolean IsSorted=true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				IsSorted=false;
				break;
			}
		}
		if(IsSorted) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}

	}

}
