package string;

public class Duplicate_word_find {

	public static void main(String[] args) {
		String st ="Arvind yadav Arvind Kejriwal Arvind Pal Pal Bhaiyo Kejriwal";
		String st2[]=st.split(" ");
		int count =0;
		String st5="";
		for(int i=0;i<st2.length;i++) {
			String st3 = st2[i];
			for(int j =0;j<st2.length;j++)
			{
				String st4=st2[j];
				if(i<j&&st3.equals(st4)){
					break;
					}
				if(st3.equals(st4))
				{
					count++;
					}
				}
				if(count==1){
					
					st5=st5+" "+st3;
					
					
		}
				count=0;
			
		}
		System.out.println(st5);
	}

}
