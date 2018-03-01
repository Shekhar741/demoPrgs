package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String st=s.next();int count=0;
		for(int i=0;i<=st.length()/2;i++)
		{
			if(st.charAt(i)==st.charAt(st.length()-1-i)){
				count++;
			}
			else{
				System.out.println("String is not a palindrome");
			}
		}
		if(count>st.length()/2){
			System.out.println("String is palindrome");
		}
		

	}

}
