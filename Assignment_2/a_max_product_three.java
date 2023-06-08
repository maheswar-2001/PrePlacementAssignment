
import java.util.*;

public class a_max_product_three {

	/* Function to find maximum product of a triplet
in array of integers of size n */
	static int maxProduct(int arr[], int n)
	{
		// if size is less than 3, no triplet exists
		if (n < 3) {
			return -1;
		}
		PriorityQueue<Integer> pqmin
			= new PriorityQueue<>();

		// second priority queue of rever order
		PriorityQueue<Integer> pqmax = new PriorityQueue<>(
			Comparator.reverseOrder());

		// iterating through array
		for (int i = 0; i < arr.length; i++) {

			pqmin.add(arr[i]);
			pqmax.add(arr[i]);
		}

		// initializing the maximum
		int maximum = pqmax.poll();
		// calculating product1
		int product1
			= maximum * pqmax.poll() * pqmax.poll();
		// calculating product2
		int product2
			= maximum * pqmin.poll() * pqmin.poll();

		// returning the maximum triplet product
		return product1 > product2 ? product1 : product2;
	}


	public static void main(String[] args)
	{
		int arr[] = { -10, -3, 5, 6, -20 };
		int n = arr.length;

		int max = maxProduct(arr, n);

		if (max == -1) {
			System.out.println("No Triplet Exists");
		}
		else {
			System.out.println(
				"Maximum triplet product is = " + max);
		}
	}
}

