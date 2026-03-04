class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>>ans=new ArrayList<>();
     List<Integer>curr=new ArrayList<>();
     subset(nums,0,ans,curr);
     return ans;
    }
    public void subset( int[] nums ,int index,  List<List<Integer>> ans ,List<Integer> curr){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subset(nums,index+1,ans,curr);
        curr.remove(curr.size()-1);
        subset(nums,index+1,ans,curr);
        }
    }