package com.deepika;

public class JumpDemo {

	//Jump - break, continue, return

	public static void main(String[] args) {
		
		//break
		/* * /
		int i=0;
		while(i>=0 && i<100) {
			System.out.println(i++);
			if(i==5) {
				break;	// breaks the loop and exits out of the loop when i is 5
			}
		}
		/* */
		
		//continue
		/*  * /
		for(int j=0; j<10; j++) {
			if( (j % 2) == 1) {		// % - modulo operator
				continue;		//skips this step in the loop and still continues the looping
			}
			System.out.println(j);
		}
		/* */
		
		System.out.println(meth(50));
		System.out.println(meth(7));
		
		//label - is not a jump statement. But, used to specify which one to break
		for(int i=0; i<10; i++) {
			
			first: 
			{
				System.out.println("Initial scope start" + i);
				
				second: 
				{
					System.out.println("Second scope start" + i);
					third:
					{
						if(i==2) {
							break second;
						}
						System.out.println("Third scope" + i);
					}
					System.out.println("Second scope end" + i);
				}
				System.out.println("Initial scope ends" + i);
				
			}
			
		}
		
		
		
	}
	
	
	static int meth(int opt) {
		for(int i=0; i<10; i++) {
			if(opt<=10) {
				if(i==5) {
					return 5;
				}
			} else {
				return 100;
			}
		}
		return 0;
	}
	
}
