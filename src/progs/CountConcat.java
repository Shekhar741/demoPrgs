package progs;

public class CountConcat {
	
	public static void main(String[] args) {
		
		String st="Hi Hello";
		char[] ch=st.toCharArray();
		String res="";
		int count=0;
		int i=0;
		while(i<ch.length)
		{
			if(ch[i]==' '){
				
					res=res+count;
					count=0;
			}
			else
			{
				count++;
				res=res+ch[i];
			}
			
			i++;
		}
		res=res+count;
		System.out.println(res);
		
			
		
	
	}
}
