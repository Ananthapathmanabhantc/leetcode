// Last updated: 8/9/2026, 9:11:04 pm
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] a = new int[2 * n];
        int i=0,k=0;

        for (int j = 0; j < n; j++) {
            for (; k < 2 * n && i<2*n; k++) {
                a[k] = nums[i];
                i += n;

            }
            i=j+1;
        }

        return a;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
        obj.shuffle(arr, 4);
    }
}