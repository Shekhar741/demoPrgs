package progs;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int n=121;
		int k=n;
		int rev=0;
		while(n!=0){
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(k==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not");
		}

	}

}
