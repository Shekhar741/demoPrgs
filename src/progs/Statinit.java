package progs;

import java.util.Scanner;

public class Statinit {
	
	static Scanner scan=new Scanner(System.in);
	static int B;
	static int H;
	static boolean flag=true;
	static{
		System.out.println("Enter B: ");
		B=scan.nextInt();
		System.out.println("Enter H: ");
		H=scan.nextInt();
		if(B<=0||H<=0){
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.println(area);
		}

	}

}
