import java.util.*;
public class a_max_sum_1
{
	static int arrayPairsSum(int num[])
	{
		Arrays.sort(num);
		int sum = 0;
		int l = num.length;
		for (int x=0;x<num.length ;x+=2 ) 
		{
			sum+= num[x];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,4,3,2};
		int x = arrayPairsSum(arr);
		System.out.println("Sum is :"+x);
	}
}


