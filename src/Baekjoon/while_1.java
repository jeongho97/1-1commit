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
			System.out.println("0���� ũ�ų� ���� 99���� �۰ų� ���� ������ �Է��ϼ���");
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
