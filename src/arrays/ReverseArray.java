package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7};
		int temp;
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
			
		}
for(int element :arr) {
	System.out.println(element);
}

	}

}
