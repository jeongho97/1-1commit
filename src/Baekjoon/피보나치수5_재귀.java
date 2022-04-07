package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_재귀 {
	
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		sb.append(f(N));
		System.out.print(sb);
		

	}
	public static int f (int N)
	{
		if(N>=2)
		{
			return f(N-1)+f(N-2);
		}
		else
		{
			return N;
		}
		
	}

}
