package progs;

public class Pattern3 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=n-1;k>=1;k--){
			for(int l=1;l<=k;l++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
