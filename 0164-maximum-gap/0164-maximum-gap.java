class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int maxdiff=0;
        while(j!=nums.length && i!=nums.length){
          int diff=nums[j]-nums[i];
          maxdiff=Math.max(diff,maxdiff);
          i++;
          j++;
        }
        return maxdiff;
        
    }
}