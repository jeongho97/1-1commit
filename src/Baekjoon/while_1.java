package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class while_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int num=Integer.parseInt(str);
		if(num<0||num>99)
		{
			System.out.println("0보다 크거나 같고 99보다 작거나 같은 정수를 입력하세요");
		}
		int count=0;
		int pre_num=num;
		while(true)
		{
			int ten=num/10;
			int one=num%10;
			int new_one=(ten+one)%10;
			num=one*10+new_one;
			count++;
			if(pre_num==num)
			{
				break;
			}
		}
		System.out.println(count);
		

	}

}
