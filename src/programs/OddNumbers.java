package programs;

public class OddNumbers {
	
	public static void main(String[] args) {
		int[] arr={1,6,8,11};
		int n=arr.length;
		String st="";
		for(int i=0;i<n-1;i++)
		{
			int l=arr[i];
			int h=arr[i+1];
			for(int j=l;j<h;j++)
			{
				if(j!=l&&j%2!=0)
				{
					if(st==""){
						st+=j;
					}
					else{
						st=st+","+j;
					}
					
				}
				
				
			}
		}
		System.out.println(st);
		
	}	
	
	

}
