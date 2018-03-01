package programs;

import java.util.Scanner;

public class NumberToWords {
	
	static String[] one={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN",
			"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
	
	static String[] two={"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
	
	public static void pw(int n,String st){
		if(n<=19){
			System.out.print(one[n]+" ");
		}
		else{
			System.out.print(two[n/10]+one[n%10]+" ");
		}
		if(n!=0){
			System.out.print(st+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		pw(num/10000000,"CRORES");
		pw((num/100000)%100, "LAKHS");
		pw((num/1000)%100, "THOUSAND");
		pw((num/100)%10, "HUNDRED");
		pw(num%100, "");

	}

}
