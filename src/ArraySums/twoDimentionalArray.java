package ArraySums;

public class twoDimentionalArray {

	public static void main(String[] args) {

		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=20;
		a[0][2]=89;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=95;
		/*for(int i=0;i<a.length;i++)
		{
			int[] js=a[i];
			for(int j=0;j<js.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		for(int[]x:a)
		{
			for(int y:x)
			{
			System.out.println(y);	
			}
		}
	}

}
