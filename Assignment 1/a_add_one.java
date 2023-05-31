public class a_add_one
{
	public static int[] add_one(int num[])
	{
		int i = num.length-1;
		while(i>=0 && num[i]==9)
		{
			i--;
		}

		if(i == -1)
		{
			int res[] = new int[num.length+1];
			res[0] = 1;
			return res;
		}

		int res[] = new int[num.length];
		res[i] = num[i]+1;
		for(int x=0;x<i;x++)
		{
			res[x] = num[x];
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int rr [] = add_one(arr);
		for(int x=0;x<rr.length;x++)
			System.out.print(rr[x]+",");
	}
}