class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           min = Math.min(nums[i],min);
           max = Math.max(nums[i],max);
            
        }
        int ans = (max-min-2*k);
        return Math.max(0,ans);
    }
    }