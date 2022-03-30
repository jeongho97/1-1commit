package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수_정렬하기_카운팅정렬 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[10001];
		
		for(int i=0; i<N; i++)
		{
			arr[Integer.parseInt(reader.readLine())]++;
		}
		
		reader.close();
		
		for(int i=1;i<10001;i++)
		{
			while(arr[i]>0)
			{
				writer.write(i+"\n");
				arr[i]--;
			}
		}
		writer.flush();
		writer.close();

	}

}
