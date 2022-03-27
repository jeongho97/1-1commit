package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
		int max=arr[0];
		for(int i=1;i<26;i++)
		{			
			if(max<arr[i])
			{
				max=arr[i];
				index=i;
			}
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println(max+" "+index);
		for(int i=0;i<26;i++)
		{
			if(i==index)
			{
				continue;
			}
			else if(max==arr[i])
			{
				//System.out.println(i);
				index=-2;
			}
		}
		result=(char)(index+65);
		System.out.print(result);
	}
}
