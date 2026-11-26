package revision;

import java.util.Scanner;

public class Print_array {
	public static void main(String[] args) {
		int flag=1;
		while(flag==1) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements of array are:");
		printArray(arr);
		System.out.println("sum of array="+Sumofarray(arr));
		
		System.out.println("avg og array ="+AvgOfArray(arr));
		
		System.out.println("Enter 1 if u want to continue .else Enter 2; ");
		flag=sc.nextInt();
		}
		System.out.println("thankyouuuuuu..//..");
		
	}
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static int Sumofarray(int[] a) {
		int sum=0;
		for (int ele : a) {
			sum=sum+ ele;
		}
		return sum;		
	}
	public static double AvgOfArray(int[] a) {
		int sum=Sumofarray(a);
		int i=sum/a.length;
		return (double) i;
	}
	
}
