package ArraySums;

import java.util.Scanner;

public class AddScanner {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner value=new Scanner(System.in);
		int a[]=new int[10];
	for(int i=0;i<a.length;i++)
	{
		a[i]=value.nextInt();
		sum+=a[i];
	}
	double average=sum/a.length;
	System.out.println(sum);
	System.out.println(average);
	}

}
