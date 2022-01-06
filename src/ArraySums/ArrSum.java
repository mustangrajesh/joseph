package ArraySums;

public class ArrSum 
{
	public static void main(String[] args) {
		try {
		int total=0;
		
		int a[]=new int[10];
		a[0]=15;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[5]=50;
		a[6]=60;
		a[7]=70;
		a[8]=80;
		a[9]=90;
		System.out.println(a.length);
		
		for(int i=0;i<=a.length;i++)
		{
			total=total+a[i];
			
		}
		System.out.println(total);
	}
		catch(Exception e) {
			
		}
	}
	

}
