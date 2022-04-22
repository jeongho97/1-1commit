package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class °ýÈ£_½ºÅÃ {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		
		
		Stack<Character> sc=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			String str=reader.readLine();
			//System.out.println(str.length());
			for(int j=0;j<str.length();j++)
			{
				sc.push(str.charAt(j));
			}
			
			int count=0;
			while(!sc.empty())
			{
				
				char c = sc.pop();
				System.out.print(count+" "+c+" ");
				//System.out.println(c);
				if(c=='(')
				{
					count-=1;
					//System.out.println(c+" "+count);
				}
				else
				{
					count+=1;
					//System.out.println(c+" "+count);
				}
				if(count<0)
				{
					//System.out.println("¤Ð¤Ð");
					//count=0;
					System.out.println("¤Ð¤Ð");
					break;
				}
			}
			if(count==0)
			{
				System.out.println("YES"+" "+sc.empty());
				
			}
			else
			{
				System.out.println("NO"+count+" "+sc.empty());
			}
			
		}

	}

}
