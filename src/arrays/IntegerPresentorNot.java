package arrays;

public class IntegerPresentorNot {

	public static void main(String[] args) {
	
		int []marks= {1,2,3,4,5,6,7,8,9,0};
		int to_find = 45;
		boolean IsinArray=false;
		
		for(int element:marks) {
			if(element==to_find) {
				IsinArray=true;
			}
		}
		if(IsinArray) {
			System.out.println("Integer is Present");
		}
		else {
			System.out.println("Integer is not Present ");
		}

	}

}
