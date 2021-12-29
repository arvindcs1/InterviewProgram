package string;

public class Reverse_String {

	public static void main(String[] args) {
		String st = "Arvind";
		String st2="";
		for(int i=st.length()-1;i>=0;i--) {
			st2=st2+st.charAt(i);
		}
     System.out.println(st2);
	}

}
