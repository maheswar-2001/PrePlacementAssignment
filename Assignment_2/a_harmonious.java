import java.util.*;
public class a_harmonious
{
	public static int findLH(int num[])
	{
		int res = 0;
		Map <Integer, Integer> count = new HashMap<>();
		for (int i : num) {
			count.put(i,count.getOrDefault(i,0)+1);	
		}
		for (int i :count.keySet()) {
			if(count.containsKey(i+1))
			{
				res = Math.max(res,count.get(i)+count.get(i+1));
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int arr[] = {11,12,12,13,14,15,11,11,11,11};
		System.out.print(findLH(arr));
	}	
}