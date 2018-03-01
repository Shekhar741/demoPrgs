package programs;

public class CharacterCountAppend {
	
	
	public static void main(String[] args) {
		String st="abbccdaafffaggd";
		char[] ch=st.toCharArray();
		int[] c=new int[128];
		String res="";
		for(int i=0;i<ch.length;i++){
			c[ch[i]]++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=1)
				res=res+(char)i+c[i];
		}
		System.out.println(res);
	
	}

	

}
