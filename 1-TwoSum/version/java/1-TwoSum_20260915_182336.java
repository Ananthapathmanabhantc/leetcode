// Last updated: 15/9/2026, 6:23:36 pm
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        
        int[] out=new int[2];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l&&i!=j;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    out[0]=j;
                    out[1]=i;
                    return out;
                    
                }
            }
        }
        return out;
        
    }
}