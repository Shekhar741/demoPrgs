package programs;

import progs.Test;

public class Test2 extends Test{
	
	public static void main(String[] args) {
		Drawable d=()->{
			System.out.println("Draw");
		};
		d.draw();
//		Test2 t=new Test2();
//		t.m();
	}
	
}
