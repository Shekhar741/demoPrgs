package progs;

public class NoCount {
	
	public static void main(String[] args) {
		String st="asasj25edu6h8";
		char[] ch=st.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='0'&&ch[i]<='9'){
//				res=res+ch[i];
				System.out.println(ch[i]);
			}
		}
//		System.out.println(res);
	}

}
