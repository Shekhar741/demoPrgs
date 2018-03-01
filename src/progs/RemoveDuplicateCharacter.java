package progs;

public class RemoveDuplicateCharacter {
	public static String toLower(String st)
	{
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>'A'&&ch[i]<'Z'){
				ch[i]=(char) (ch[i]+32);
			}
		}
		return new String(ch);
	}

	public static final void main(String[] args) {
		
		String st="shekhars";
//		String dup=toLower(st);
		
		String res="";
		for(int i=0;i<st.length();i++)
		{
			if(!res.contains(String.valueOf(st.charAt(i)))){
				res=res+(String.valueOf(st.charAt(i)));
			}
		}
		System.out.println(res);

	}

}
