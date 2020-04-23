package com.anotherpkg;

public class ModifierDemoOnSamePkg {

	public static void main(String[] args) {
		
		//trying to call the method from the "Modifier" class
		Modifier m = new Modifier();
		
		m.defaultMeth(); 	// default / no modifier
		m.protectedMethod(); 	//protected modifier
		m.publicMethod(); 	//public modifierr
		
		ModifierSubClass msc = new ModifierSubClass();	//all method accessible except private
		msc.defaultMeth();
		msc.protectedMethod();		//protected is accessible because of same package
		msc.publicMethod();
		
		msc.subclassMethod();
		
	}
	
}
