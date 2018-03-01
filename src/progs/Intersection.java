package progs;

public class Intersection {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,1};
		int[] b={6,7,8,1,5};
		int[] res;
	    if(a.length>b.length){
	    	 res=new int[b.length];
	    }
	    else{
	    	res=new int[a.length];
	    }
		int c=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++){
				if(b[i]==a[j]){
					res[c]=b[i];
					c++;
					break;
				}
			}
		}
		System.out.println("Intersected elements are:");
		for(int i=0;i<c;i++){
			System.out.print(res[i]+" ");
		}

	}

}
