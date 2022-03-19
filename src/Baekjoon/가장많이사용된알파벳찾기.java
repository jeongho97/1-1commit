package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장많이사용된알파벳찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String st = reader.readLine();
		
		int [] arr = new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=0;
		}
	
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='a'&&st.charAt(i)<='z')
			{
				arr[st.charAt(i)-'a']+=1;
			}
			else if(st.charAt(i)>='A'&&st.charAt(i)<='Z')
			{
				arr[st.charAt(i)-'A']+=1;
			}	
		}
		int index=0;
		char result;
		for(int i=1;i<26;i++)
		{
			int max=arr[0];
			
			if(max<arr[i]) //가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ? 출력하기 구현 해야함
			{
				max=arr[i];
				index=i;
			}
		}
		result=(char)(index+65);
		System.out.print(result);
	}
}
