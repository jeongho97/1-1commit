package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_1_백트래킹 {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr=new int[M];
		visit=new boolean[N];
		dfs(N,M,0);
		System.out.print(sb);
	}
	public static void dfs(int N, int M, int depth) {
		if(depth==M)
		{
			for(int val:arr)
			{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<N;i++)
		{
			if(!visit[i])
			{
				visit[i]=true;
				arr[depth]=i+1;
				dfs(N,M,depth+1);
				visit[i]=false;
			}
		}
	}

}
