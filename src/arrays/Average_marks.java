package arrays;

public class Average_marks {

	public static void main(String[] args) {
        int []marks = {75,85,95,32,45,96};
		
		int no_of_stu = marks.length;
		int sum =0;

		for(int element:marks) {
			sum=sum+element;
		}
		int avg = sum/no_of_stu;
		System.out.println("The avg marks of the students is :"+avg);
	}

}
