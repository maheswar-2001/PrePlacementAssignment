public class a_remove_element
{
	public static int remove_element(int num[], int val)
	{
		int ctr = 0;
		for(int x=0;x<num.length;x++)
		{
			if(num[x] != val)
			{
				ctr++;
			}
		}
		return ctr;
	}
	public static void main(String[] args) {
		int arr[] = {3,2,2,3};
		int k = remove_element(arr,3);
		System.out.print(k);
	}
}