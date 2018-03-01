package progs;

public class CharacterCount {

	public static void main(String[] args) {
		String st="Hello java world";
		count(st);		

	}

	private static void count(String st) {
		
		char[] ch=st.toCharArray();
		String res="";
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' '){
				count++;
				res=res+ch[i];
			}
			else{
				System.out.println(res+"------->"+count);
				res="";
				count=0;
				
			}
			
		}
		System.out.println(res+"------->"+count);
		
		
	}

}
