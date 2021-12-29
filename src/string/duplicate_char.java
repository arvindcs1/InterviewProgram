package string;

public class duplicate_char {
public static void main(String[] args) {
	String s="mahabharatmm";
	int count=0;
	String s1=" ";
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		for(int j=0;j<s.length();j++) {
			char ch1=s.charAt(j);
			if(ch==ch1 && i>j) {
				break;
			}
			if(ch==ch1) {
				count++;
			}
		}
		if(count>1) {
			s1=s1+ch;
		}
		count=0;
	}                                                                                                                            
	System.out.println(s1);
}
}
