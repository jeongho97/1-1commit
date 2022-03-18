package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class find_maxmin {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(reader.readLine());
		StringTokenizer st=new StringTokenizer(reader.readLine());
		
		String str = reader.readLine();
		int[] arr2 = new int[num];
		arr2=Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	
		
		String str2=reader.readLine();
		int[] arr3 = new int[str2.length()];
		for(int i=0;i<str2.length();i++)
		{
			arr3[i]=str2.charAt(i)-'0';
		}
		
		//System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		int index=0;
		int[] arr = new int[num];
		while(st.hasMoreTokens())
		{
			arr[index]=Integer.parseInt(st.nextToken());
			index++;

		}
		Arrays.sort(arr2);
		System.out.print(arr2[0]+" "+arr2[num-1]);

	}
}
