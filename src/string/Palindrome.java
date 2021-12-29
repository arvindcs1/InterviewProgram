package string;

public class Palindrome {

	public static void main(String[] args) {
		String st="Arvind";
		String st2="";
		for(int i=st.length()-1;i>=0;i--) {
			st2=st2+st.charAt(i);
		}
if(st.equals(st2)) {
	System.out.println("String is palindrome");
}
else {
	System.out.println("String is not Palindrome");
}

	}

}
