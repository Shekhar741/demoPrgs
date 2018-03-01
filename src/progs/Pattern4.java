package progs;

public class Pattern4 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=n-1;l>=1;l--){
			for(int m=n-1;m>=l;m--){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*l)-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
