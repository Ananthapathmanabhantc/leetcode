// Last updated: 8/9/2026, 7:23:50 pm
class Solution {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i-n];
            }

        }
        return ans;
        


        
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        int[] arr={1,2,1};
        obj.getConcatenation(arr);
    }

}