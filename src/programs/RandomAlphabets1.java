package programs;

public class RandomAlphabets1 {
	
	public static void main(String[] args) {
		String s1="abc";
		String s2="def";
		String res="";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for(int i=0;i<ch1.length;i++){
			res=res+ch1[i];
		}
		for(int i=0;i<ch2.length;i++)
		{
			if(i==0||i%2!=0){
				res=res+ch2[i];
			}
			else 
				break;
		}
		System.out.println(res);
	}

}
