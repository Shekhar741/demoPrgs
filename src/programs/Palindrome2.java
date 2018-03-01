package programs;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String st=s.next();
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String res=new String(ch);
		if(st.equals(res)){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
 
	}

}
