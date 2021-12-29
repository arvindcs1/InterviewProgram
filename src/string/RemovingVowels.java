package string;

public class RemovingVowels {

	public static void main(String[] args) {
		String st = "Removing VowelsA";
		String st1 ="";
		String st2="";
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				st1 = st1+st.charAt(i);
			}
			if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U') {
				st1 = st1+st.charAt(i);
			}
			
			else {
				st2 = st2+st.charAt(i);
			}
		}
		System.out.println(st2);

	}

}
