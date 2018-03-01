package programs;

public class RandomAlphabets {

	public static void main(String[] args) {
		String s1="abc";
		String s2="def";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		String result="";String result1="";String result2="";
		for(int i=0;i<ch1.length;i++){
			if(i==0||i%2!=0){
				result1=result1+ch1[i];
			}
			else
			{
				result2=result2+ch1[i];
			}
		}
		for(int i=0;i<ch2.length;i++){
			if(i==0||i%2!=0){
				result1=result1+ch2[i];
			}
			else
			{
				result2=result2+ch2[i];
			}
		}
		
		result=result1+result2;	
		System.out.println(result);

	}

}
