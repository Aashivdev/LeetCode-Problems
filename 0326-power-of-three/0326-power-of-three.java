class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n== -1){
            return false;
        }
        double x = Math.pow(3,19);
        if(n>0 && x%n==0){
            return true;
        }
        return false;
        
    }
}