package arrays;

public class MaximumNum {

	public static void main(String[] args) {
		int []arr = {11,2,43,4,5,66};
        int max =0;
        for(int element:arr) {
        	if(max<element) {
        		max=element;
        	}
        }
 System.out.println("Maximum number is array is :"+max);
	}

}
