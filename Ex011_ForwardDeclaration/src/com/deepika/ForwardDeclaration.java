package com.deepika;

public class ForwardDeclaration {

	void meth(int x) {
		System.out.println(x);
	}
	
	void dbInfo(String conUrl, String uname, String pwd) {
		//logic to insert info in db
		
		ForwardDeclaration2 fd2 = new ForwardDeclaration2();
		fd2.dbOperation(conUrl, uname, pwd);
	}
	
}
