package progs;

public class CharPattern2 {
	public static void main(String[] args) {
		
	
		for(int i=1;i<=5;i++){
			int n=65;
			for(int j=1;j<=i;j++){
				System.out.print((char)n+" ");
				n++;
			}
			System.out.println();
		}
	}

}