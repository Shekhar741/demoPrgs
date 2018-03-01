package programs;

public class Occurence {

	public static void main(String[] args) {
		String st="aaasddaeddcssaqedaqAA";
		int[] c=new int[128];
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			c[ch[i]]++;
		}
		
		for(int i=0;i<c.length;i++){
			if(c[i]>1)
			System.out.println((char)i+"-------"+c[i]);
		}
		

	}

}
