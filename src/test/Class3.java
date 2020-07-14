package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class Class3 {
	@Test
	public void a() {
		try {
			Object o = TestClass2.class.newInstance();
			Method m = TestClass2.class.getDeclaredMethod("a");
			m.setAccessible(true);
			m.invoke(o);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
