package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		StringTokenizer st= new StringTokenizer(reader.readLine());
		
		int[] arr = new int[N];
		int index=0;
		while(st.hasMoreTokens())
		{
			arr[index]=Integer.parseInt(st.nextToken());
			index++;
		}
		boolean[] result=new boolean[arr.length];
		for(int k=0;k<arr.length;k++)
		{
			result[k]=true;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=1)
			{
				for(int j=2;j<arr[i];j++)
				{
					if(arr[i]%j==0)//소수 아닌것은 false
					{
						result[i]=false;
					}
				}
				if(result[i]==true)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		

	}

}
