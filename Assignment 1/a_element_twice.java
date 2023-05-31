import java.util.*;
public class a_element_twice
{
	
	public static boolean element(int num [])	
	{
		Map<Integer,Integer> map = new HashMap<>();int c =0;
		for(int x=0;x<num.length;x++)
		{
			if(map.containsKey(num[x]))
			{
				c++;break;
			}
			else {
				map.put(num[x],x);
			}
		}
		if (c == 0)
			return false;
		else
			
			return true;
	}


	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,7,8,3};
		System.out.println(element(arr));
	}
}