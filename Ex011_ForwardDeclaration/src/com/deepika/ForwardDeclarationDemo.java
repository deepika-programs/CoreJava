package com.deepika;

public class ForwardDeclarationDemo {

	public static void main(String[] args) {
		
		ForwardDeclaration fd = new ForwardDeclaration();
		
		fd.meth(100);
		
		fd.dbInfo("localhost:3306/db", "root", "root");
		
	}
	
}
