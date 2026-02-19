class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
      
        int finalmax=1;
        int curmax=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i - 1]){
                continue;   
            }
            if(nums[i] == nums[i-1]+1){
                curmax++;
            }
            else {
                finalmax = Math.max(finalmax, curmax);
                curmax = 1;
            }

        }
        
        return Math.max(finalmax,curmax);
    }
}