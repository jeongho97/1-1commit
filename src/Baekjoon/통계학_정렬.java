package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class �����_���� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		int[] arr=new int[8001];
		int[] arrsort=new int[N];
		
		double sum=0;
		for(int i=0; i<N;i++)
		{
			int num=Integer.parseInt(reader.readLine());
			arr[num+4000]++;
			sum+=num;
			
		}
		System.out.printf("%.0f\n", sum/N); //������
		int i=0;
		int max=0;
		int mode=0;
		for(int j=0; j<8001; j++)
		{
			if(arr[j]>0)
			{
				if(max<arr[j])
				{
					max=arr[j];
				}
				else if(max==arr[j])
				{
					if(max<arr[j])
					{
						mode=max;
					}
					else
					{
						mode=arr[j];
					}
					//�ֺ��� ������ ������ �ֺ� �� �� ��°�� ���� ���� ���
				}
			}
			while(arr[j]>0)
			{
				int num_result=j-4000;
				arrsort[i]=num_result;
				i++;
				arr[j]--;
			}
		}

		double median=(N/2)*1/1.0;
		System.out.println(arrsort[(int)median]); //�߾Ӱ�
		System.out.println(mode);
		System.out.println(arrsort[N-1]-arrsort[0]); //����
	}

}
