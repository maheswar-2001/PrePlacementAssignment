public class a_merge_sorted
 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {

            if (i >= 0 && j >= 0) {

                if (nums1[i] >= nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            } else if (j >= 0) {
                nums1[k--] = nums2[j--];

            } else {
                break;
            }

        }
    }
    public static void main(String[] args) 
    {
        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        int m = 3,n=3;
        merge(num1,m,num2,n);
        for(int x=0;x<num1.length;x++)
        {
            System.out.print(num1[x]+",");
        }
    }
}