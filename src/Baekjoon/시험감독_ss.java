package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시험감독_ss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] arr=new int[N];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int i=0;
		while(N>0)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
			N--;
		}
		StringTokenizer st2=new StringTokenizer(reader.readLine());
		int B=Integer.parseInt(st2.nextToken());
		int C=Integer.parseInt(st2.nextToken());
		
		long count=0; //백만개의 강의장에 백만명이 있을때 INT 범위를 넘기 때문에 long 타입으로 해주어야한다
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=arr[j]-B;
			count++;
			if(arr[j]<=0)
			{
				continue;
			}
			else
			{
				count=count+arr[j]/C;
				if(arr[j]%C>0)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
