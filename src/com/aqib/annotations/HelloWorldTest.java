package com.aqib.annotations;

import java.lang.reflect.Method;

public class HelloWorldTest {
	public static void main(String[] args) {

		HelloWorldRunner runner = new HelloWorldRunner();
		Method[] methods = runner.getClass().getMethods();

		for (Method method : methods) {
			HelloWorld annos = method.getAnnotation(HelloWorld.class);
			if (annos != null) {
				try {
					method.invoke(runner);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
