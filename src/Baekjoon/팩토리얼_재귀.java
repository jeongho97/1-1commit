package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÆÑÅä¸®¾ó_Àç±Í {
	
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		sb.append(factorial(N));
		System.out.print(sb);
	}
	public static int factorial(int N)
	{
		if(N<=1)
		{
			return 1;
		}
		else
		{
			return N*factorial(N-1);
		}
	}

}
