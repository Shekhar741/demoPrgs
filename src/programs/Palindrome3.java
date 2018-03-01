package programs;

public class Palindrome3 {

	public static void main(String[] args) {
		String st="gadag";
		System.out.println("Input String is:"+st);
		String res="";
		for(int i=st.length()-1;i>=0;i--){
			res=res+st.charAt(i);
		}
		if(st.equals(res)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		

	}

}
