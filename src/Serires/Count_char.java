package Serires;

public class Count_char {
	
public static void main(String[] args) {
	String st = "arvind Yadav";
	char ch = 'a';
	int count=0; 
	for(int i=0;i<st.length();i++) {
		char ch2=st.charAt(i);
		if(ch2==ch) {
			count++;
		}
	}
	System.out.println(count);
}
}
