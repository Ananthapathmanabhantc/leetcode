// Last updated: 14/9/2026, 7:07:17 pm
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < l-1; i++) {
           if(nums[i]==nums[i+1])
           return true;

        }

        return false;
    }
}