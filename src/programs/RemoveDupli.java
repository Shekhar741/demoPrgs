package programs;

public class RemoveDupli {

	public static void main(String[] args) {
		String st="shekharsa";
		String result="";
		for(int i=0;i<st.length();i++)
		{
			boolean found=false;
			for(int j=0;j<result.length();j++)
			{
				if(st.charAt(i)==result.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(!found){
				result=result+st.charAt(i);
			}
			
		}
		System.out.println(result);

	}

}
