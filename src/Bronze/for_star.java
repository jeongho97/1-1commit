package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class for_star {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		int num=Integer.parseInt(str);
		
		for(int i=0;i<num;i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		int i=0,j=0,k=0;
		for(i=num;i>0;i--)
		{
			for(j=0; j<i-1;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<num-j;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
