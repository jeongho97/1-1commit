package Baekjoon;

public class self_number {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		// TODO Auto-generated method stub
		for(int i=0;i<10001;i++)
		{
			int n=d(i);
			if(n<10001)
			{
				check[n]=true;
			}
		}
		
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<10001;i++)
		{
			if(check[i]==false)
			{
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);

	}
	public static int d(int n)
	{
		int sum=n;
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}

}
