

import java.util.Scanner;

public class Calculator {
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void sub(int a,int b) {
		int subtraction=a-b;
		System.out.println("subtraction ="+subtraction);
	}
	public static void mul(int a,int b) {
		int multiplication=a*b;
		System.out.println("multiplication ="+multiplication);
	}
	public static void div(int a,int b) {
		int division=a/b;
		System.out.println("division ="+division);
	}
	
	public static void main(String arg[]) {
		int flag=1;
		while (flag ==1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your operations (+,-,*,/) : ");
		char op= sc.next().charAt(0);
		System.out.println("Enter input a :");
		int a=sc.nextInt();
		System.out.println("Enter input b :");
		int b=sc.nextInt();
		
		switch(op) {
		case '+':
			add(a,b);
			break;
		case '-':
			sub(a,b);
			break;
		case '*':
			mul(a,b);
			break;
		case '/':
			div(a,b);
			break;	
		default:
			System.out.println("invalid input");
		}
		System.out.println("Enter 1 to continue \n enter 2 to stop");
		flag=sc.nextInt();
	
		}
		System.out.println("thankyou..............");
	}

}
