package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class N과M_1_백트래킹 {
	public static boolean[] visit;
	public static int[] arr;
	public static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int N;
	public static int M;
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		visit=new boolean[N];
		arr=new int[M];
		
		int depth=0;
		dfs(depth);
		
		writer.flush();
		writer.close();
		
		
	}
	public static void dfs(int depth) throws IOException
	{
		if(depth==M)
		{
			for(int i:arr)
			{
				writer.write(i+" ");
			}
			writer.write("\n");
			return; //return을 해줘서 함수를 끝내준다. 안그러면 밑에 for문 돌면서 depth값 늘어나서 arr 배열 크기 벗어남
		}
		for(int i=0;i<N;i++)
		{
			if(!visit[i])
			{
				visit[i]=true;
				arr[depth]=i+1;
				dfs(depth+1);
				visit[i]=false;
			}
		}
	}


}
