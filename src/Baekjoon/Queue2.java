package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue2 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(reader.readLine());
		Deque<Integer> queue =new LinkedList<>();
		for(int i=0; i<N;i++)
		{
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String str = st.nextToken();
			
			switch(str)
			{
			case "push":
				int data =Integer.parseInt(st.nextToken());
				queue.offer(data);
				break;
			case "pop":
				Integer pp=queue.poll();
				if(pp==null)
				{
					sb.append(-1).append('\n');
				}
				else
				{
					sb.append(pp).append('\n');
				}
				break;
			case "size":
				sb.append(queue.size()).append('\n');
				break;
			case "empty":
				if(queue.isEmpty())
				{
					sb.append(1).append('\n');
				}
				else
				{
					sb.append(0).append('\n');
				}
				break;
			case "front":
				Integer ft=queue.peek();
				if(ft==null)
				{
					sb.append(-1).append('\n');
				}
				else
				{
					sb.append(ft).append('\n');
				}
				break;
			case "back":
				Integer bk = queue.peekLast();
				if(bk==null)
				{
					sb.append(-1).append('\n');
				}
				else
				{
					sb.append(bk).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);

	}

}
