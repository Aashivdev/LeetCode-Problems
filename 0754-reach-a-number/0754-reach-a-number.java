class Solution {
    public int reachNumber(int target) {
        target =Math.abs(target);
        int num=0;
        int count=0;
        while(num<target || (num-target)%2!=0){
            count++;
            num+=count;
        }
        return count;
        
    }
}