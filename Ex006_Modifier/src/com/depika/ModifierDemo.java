package com.depika;

import com.anotherpkg.Modifier;

public class ModifierDemo {

	//Scope of the variable/method/constructor/class or Modifier
	/*
		Modifier	package		subclass	global/world
		public		Yes			Yes				Yes
		protected	Yes			Yes				No
		default		Yes			Yes				No
		private		No			No				No			(only within the class)
	*/
	
	public static void main(String[] args) {
		
		//trying to call the method from the "Modifier" class
		Modifier m = new Modifier();
		
		m.publicMethod();//only public method is accessible out of 4 methods
		
	}
}
