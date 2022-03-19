package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ¾ËÆÄºªÃ£±â {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String st = reader.readLine();
		
		int [] arr = new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=-1;
		}
	
		for(int i=0;i<st.length();i++)
		{
			if(arr[st.charAt(i)-'a']==-1)
			{
				arr[st.charAt(i)-'a']=i;
			}
		}
		for(int i=0;i<26;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
