package com.anotherpkg;

public class Modifier {
	
	void defaultMeth() {
		System.out.println("Method with no modifier / default");
	}
	
	private void privateMethod() {
		System.out.println("Private method content");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method content");
	}
	
	public void publicMethod() {
		System.out.println("public method content");
	}
}
