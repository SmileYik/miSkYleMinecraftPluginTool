package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Class3 {
	@Test
	public void a() {
	  Random r = new Random();
		while(true) {
		  System.out.println(new Date().toString());
		 
		}
	}
}
