package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 부녀회장이될테야 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(reader.readLine());
		int[] result=new int[t];
		for(int count=0;count<t;count++)
		{
			int k = Integer.parseInt(reader.readLine());
			int n = Integer.parseInt(reader.readLine());
			
			int[][] arr = new int[k+1][n+1];
			int sum=0;
			int sum2=0;
			
			for(int i=0; i<=n;i++)
			{
				arr[0][i]=i;
			}
			
			
			for(int i=1;i<=k;i++)
			{
				for(int j=0;j<=n;j++)
				{
					sum2+=arr[i-1][j];
					arr[i][j]=sum2;
				}
				sum2=0;
			}
			result[count]=arr[k][n];	
		}
		for(int r=0;r<t;r++)
		{
			System.out.println(result[r]);
		}
	}

}
