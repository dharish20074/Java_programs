package revision;

import java.util.Scanner;

public class Armstrong {
	public static int power(int base,int expo) {
		int res=1;
		for(int i=1;i<=expo;i++) {
			res=res*base;
		}	
		return res;
	}
	public static int digitcount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static boolean isArmstrong(int num ) {
		int digits=digitcount(num);
		int sum=0;
		int temp=num;
		while(num!=0) {
			int last=num%10;
			sum=sum+power(last,digits);
			num=num/10;
		}
		return sum==temp;
		
	}
	public static void main(String[] args) {
		int flag=1;
		while (flag==1) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the number to check amstrong or not");
		int num=c.nextInt();
		if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
		System.out.println("Enter 1 to continue checking else Enter 2");
		flag= c.nextInt();
		}
		System.out.println("thankyou..............");
	}   
}
