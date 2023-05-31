import java.util.*;
public class a_twosum_1 
{
	//static int rr[] = new int[2];
	public static int[] two_sum(int num [], int target)	
	{
		int result[] = new int [2];
		Map<Integer,Integer> map = new HashMap<>();
		for(int x=0;x<num.length;x++)
		{
			if(map.containsKey(num[x]))
			{
				result[0] = x;
				result[1] = map.get(num[x]);
			}
			else {
				map.put(target-num[x],x);
			}
		}
		return result;
	}


	public static void main(String[] args) 
	{
		int arr[] = {3,4,9,6,4};
		int rr[] = two_sum(arr,8);
		System.out.println(rr[0]+" "+rr[1]);
	}
}