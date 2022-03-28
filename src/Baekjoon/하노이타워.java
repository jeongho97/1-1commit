package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 하노이타워 {
	static BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(reader.readLine());
		writer.write((int)(Math.pow(2, N)-1)+"\n");
		Hanoi(N,1,2,3);
		
		writer.flush();
		writer.close();

	}
	public static void Hanoi(int N,int start,int mid, int to) throws IOException
	{
		if(N==1)
		{
			writer.write(start+" "+to+'\n');
			return;
		}
		
		
		Hanoi(N-1,start,to,mid);
		
		writer.write(start+" "+to+"\n");
		
		Hanoi(N-1,mid,start,to);
	}

}
