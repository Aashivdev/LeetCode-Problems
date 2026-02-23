class Solution {
    public int search(int[] nums, int target) {
        return recursiverotatedbs(nums,target,0,nums.length-1);
        
    }
     public int recursiverotatedbs(int[] arr , int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[start]<=arr[mid]){
            if(arr[start] <= target && target < arr[mid]){
                return (recursiverotatedbs(arr,target,start,mid-1));
            }
            else{
                return (recursiverotatedbs(arr,target,mid+1,end));
            }
        }
        else if(arr[mid]<=target && target <= arr[end]){
            return recursiverotatedbs(arr,target,mid+1,end);
        }
        else{
            return recursiverotatedbs(arr,target,start,mid-1);
        }

    }
}