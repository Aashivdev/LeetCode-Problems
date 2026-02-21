class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long numofzeros=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                numofzeros++;
            }
            else{
                ans+=(numofzeros*(numofzeros+1)/2);
                numofzeros=0;
            }
        }
        return ans+=(numofzeros*(numofzeros+1)/2);
    }
}