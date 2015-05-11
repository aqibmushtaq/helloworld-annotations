package com.aqib.annotations;

public class HelloWorldRunner {
	
	@HelloWorld
	public void sayHi() {
		System.out.println("Hello world!");
	}
	
	@HelloWorld
	public void sayBye() {
		System.out.println("Bye :)");
	}
	
}
