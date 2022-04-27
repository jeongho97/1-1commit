package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_basic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(reader.readLine());
		Stack<String> sc = new Stack<>();
		
		for(int i=0;i<N;i++)
		{
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd=st.nextToken();
			
			switch(cmd) 
			{
			case "push":
				String num=st.nextToken();
				sc.push(num);
				break;
			case "pop":
				if(sc.empty())
				{
					sb.append(-1+"\n");
				}
				else
				{
					sb.append(sc.pop()+"\n");
				}
				break;
			case "size":
				sb.append(sc.size()+"\n");
				break;
			case "empty":
				if(sc.empty())
				{
					sb.append(1+"\n");
				}
				else
				{
					sb.append(0+"\n");
				}
				break;
			case "top":
				if(sc.empty())
				{
					sb.append(-1+"\n");
				}
				else
				{
					sb.append(sc.peek()+"\n");
				}
				break;
			}
				
			
		}
		System.out.println(sb);

	}

}
