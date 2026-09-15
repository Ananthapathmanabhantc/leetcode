// Last updated: 15/9/2026, 6:37:00 pm
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        
        int[] out=new int[2];
        Map<Integer,Integer> indices=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            indices.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(indices.containsKey(target-nums[i])&&indices.get(target-nums[i])!=i)
            {
                out[1]=indices.get(target-nums[i]);
                out[0]=i;
                return out;

            }
        }
        return out;
        
    }
}