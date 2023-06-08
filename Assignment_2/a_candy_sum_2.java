import java.util.*;
public class a_candy_sum_2
{
    public static int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for (int c : candyType) 
        {
            s.add(c);
        }
        return Math.min(candyType.length >> 1, s.size());
    }
    public static void main(String[] args) {
    	int arr[] = {1,1,2,2,3,3};
    	int x = distributeCandies(arr);
    	System.out.print(x);
    }
}
