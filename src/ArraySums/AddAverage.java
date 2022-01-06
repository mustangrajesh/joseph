package ArraySums;

public class AddAverage {
public static void main(String[] args) {
		
		int sum=0;
		int total=0;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<=a.length;i++)
		{
			sum+=i;
			//System.out.println(sum);
		}
		double total1=sum/a.length;
		System.out.println(sum);
		System.out.println(total1);
	}


}
