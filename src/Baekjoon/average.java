package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class average {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		int case_num = Integer.parseInt(reader.readLine());
		int[] arr;
		double[] arr2=new double[case_num];
		
		for(int i=0; i<case_num;i++)
		{
			int sum=0;
			double avg=0.0;
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int student_num=Integer.parseInt(st.nextToken());
			arr=new int[student_num];
			for(int j=0;j<student_num;j++)
			{
				arr[j]=Integer.parseInt(st.nextToken());
				sum+=arr[j];
			}
			avg=(double)(sum/student_num);
			int count=0;
			for(int k=0;k<student_num;k++)
			{
				if(arr[k]>avg)
				{
					count++;
				}
			}
			arr2[i]=(double)count/student_num*100;
		}
		for(int i=0;i<case_num;i++)
		{
			System.out.printf("%.3f%%\n",arr2[i]);
		}
	}

}
