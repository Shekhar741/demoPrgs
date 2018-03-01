package progs;

public class ArrayPailndrome {

	public static void main(String[] args) {
		int[] a={1,4,3,7,3,4,1};
		int count=0;
		for(int i=0;i<=a.length/2;i++){
			if(a[i]==a[a.length-1-i]){
				count++;
			}
		}
		if(count>=a.length/2){
			System.out.println("Array is pallindrome");
		}
		else{
			System.out.println("Not");
		}
		

	}

}
