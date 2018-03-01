package progs;

import java.util.Scanner;

public class Solution1 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the Number: ");
	        int N = in.nextInt();
	        if(N>=2&&N<=20)
	        {
	        	for(int i=1;i<=10;i++){
	        		int res=N*i;
	        		System.out.println(N+"*"+i+"="+res);
	        	}
	        }
	        else 
	        	System.out.println("Invalid Number");
	    }

}
