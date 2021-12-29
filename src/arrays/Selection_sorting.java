package arrays;

public class Selection_sorting {

	public static void main(String[] args) {
		int []arr = {11,2,43,4,5,66};
		int min;
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp =arr[i];
			arr[i]= arr[min];
			arr[min]=temp;
			
		}
		for(int element:arr ) {
			System.out.print(element+" ");
		}

	}

}
