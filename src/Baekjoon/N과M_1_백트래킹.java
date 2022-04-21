package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class N��M_1_��Ʈ��ŷ {
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
			return; //return�� ���༭ �Լ��� �����ش�. �ȱ׷��� �ؿ� for�� ���鼭 depth�� �þ�� arr �迭 ũ�� ���
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
