class Solution {
    public double findMaxAverage(int[] nums, int l) {
    int maxsum=0;
    int sum=0;
    for(int i=0;i<l;i++){
        sum+=nums[i];
    }
    maxsum=sum;
    for(int i=l;i<nums.length;i++){
        sum=sum-nums[i-l]+nums[i];
        maxsum=Math.max(sum,maxsum);
    }
    return (double)maxsum/l;
    }
}