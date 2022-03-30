package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수_정렬하기1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		
		int[] arr=new int[N];
		
		for(int i=0; i<N;i++)
		{
			arr[i]=Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<N;i++)
		{
			writer.write(arr[i]+"\n");
		}
		
		writer.flush();
		writer.close();

	}

}
