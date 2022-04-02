package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 통계학_정렬 {

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
		int i=0;
		int max=0;
		int mode=0;
		boolean flag=false;
		for(int j=0; j<8001; j++)
		{
			if(arr[j]>0)
			{
				if(max<arr[j])
				{
					max=arr[j];
					mode=j-4000;
					flag=true;
				}
				else if(max==arr[j]&&flag==true) //최빈값이 같은 수가 있을 때
				{
					if(mode<j-4000)
					{
						mode=j-4000;
						flag=false; //한번만 교체하면 두번째 값이다.
					}
					//최빈값이 여러개 있을때 최빈값 중 두 번째로 작은 값을 출력
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

		System.out.println((int)Math.round((double)sum/N)); //산술평균
		double median=(N/2)*1/1.0;
		System.out.println(arrsort[(int)median]); //중앙값
		System.out.println(mode);
		System.out.println(arrsort[N-1]-arrsort[0]); //범위
	}

}
