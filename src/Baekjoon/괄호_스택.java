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
		
		for(int i=0;i<n;i++)
		{
			Stack<Character> sc=new Stack<>();
			String str=reader.readLine();
			for(int j=0;j<str.length();j++)
			{
				sc.push(str.charAt(j));
			}
			
			int count=0;
			while(!sc.empty())
			{
				
				char c = sc.pop();

				if(c=='(')
				{
					count-=1;
				}
				else
				{
					count+=1;
				}
				if(count<0)
				{

					break;
				}
			}
			if(count==0)
			{
				System.out.println("YES");
				
			}
			else
			{
				System.out.println("NO");
			}
			
		}

	}

}