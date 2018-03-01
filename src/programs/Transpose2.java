package programs;

public class Transpose2 {

	public static void main(String[] args) {
        int n = 3;int count=1;
        int[][] a = new int[n][n];
        int k=a.length-1;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] =count;
                count++;
            }
        }
        System.out.println("Before");
        System.out.println("------");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j =i+1; j < n; j++) 
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("After");
        System.out.println("------");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
     
    }

	}


