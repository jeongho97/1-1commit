package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class µ¢Ä¡µî¼ö {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		int[][] arr=new int[N][3];
		
		for(int i=0; i<N;i++)
		{
			int index=0;
			StringTokenizer st = new StringTokenizer(reader.readLine());
			while(st.hasMoreTokens())
			{
				arr[i][index]=Integer.parseInt(st.nextToken());
				index++;
			}
			arr[i][2]=1;
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1])
				{
					arr[i][2]++;
				}
			}
			writer.write(arr[i][2]+" ");
		}
		
		writer.flush();
		writer.close();
		

	}

}
