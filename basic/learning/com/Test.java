package basic.learning.com;

import java.util.Scanner;

public class Test {
	public void car() {
		Scanner in1=new Scanner(System.in);
		System.out.println("Enter the principle value:");
		int p=in1.nextInt();
		System.out.println("Enter the number of year value:");
		int n=in1.nextInt();
		System.out.println("Enter the rate value:");
		int r=in1.nextInt();
		int res=(p*n*r)/100;
		System.out.println("The simple interest is "+res);
		in1.close();
		
	}
	
 
}
