package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class find_max_index {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int [] arr=new int[9];
		for(int i=0;i<9;i++)
		{
			arr[i] =Integer.parseInt(reader.readLine()) ;
		}
		int max=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}

}
