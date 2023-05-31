public class a_shift_zero_left
{
	public static void shift_left(int arr[])
	{
		int c =0;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]!=0)
			{
				arr[c] = arr[x];
				c++;
			}
		}
		while (c<arr.length)
            arr[c++] = 0;
        
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+",");
		}
	}
	public static void main(String[] args) {
		int a[]={0,1,0,3,12};
		shift_left(a);
	}
}