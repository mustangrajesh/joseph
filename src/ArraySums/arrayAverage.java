package ArraySums;

public class arrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int length=a.length;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		double avg=sum/length;
		System.out.println(avg);
		
	}

}
