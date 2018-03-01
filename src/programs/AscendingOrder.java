package programs;

import java.util.Scanner;

public class AscendingOrder {
	
	public static void main(String[] args) {
		int[] num={12,3,6,5,8,2};
		int n=num.length;
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Elements to sort:");
		int n=s.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
		}
		System.out.println("Entered elements are:");
		for(int i=0;i<n;i++){
			System.out.println(num[i]);
		}*/
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(num[i]<num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for(int i=0;i<n;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int first=num[0];
		int last=num[n-1];
		System.out.println("First element in Array is: "+first);
		System.out.println("Last element in Array is: "+last);
		
			
		
	}

}
