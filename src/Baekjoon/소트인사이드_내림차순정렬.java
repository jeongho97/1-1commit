package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ��Ʈ�λ��̵�_������������ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String N =reader.readLine();
		//System.out.print(N.length());
		
		int[] num=new int[N.length()];
		
		int number = Integer.parseInt(N);
		int index=0;
		while(number>0)
		{
			num[index]=number%10;
			number=number/10;
			index++;
		}
		//System.out.print(index);
		Arrays.sort(num);
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(num[i]);
		}

	}

}
