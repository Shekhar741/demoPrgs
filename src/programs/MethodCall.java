package programs;

import java.lang.reflect.Method;

public class MethodCall {

	public static void main(String[] args)throws Exception {
		A a=new A();
		Method m=A.class.getDeclaredMethod("message");
		m.setAccessible(true);
		m.invoke(a, null);

	}

}
