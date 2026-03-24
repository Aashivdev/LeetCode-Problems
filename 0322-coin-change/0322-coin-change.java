class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans=  dp(coins,amount,new HashMap<>());
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int dp(int[] coins , int amount ,HashMap<Integer,Integer>memo){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(memo.containsKey(amount)){
            return memo.get(amount);
        }
        int min = Integer.MAX_VALUE;
      
            for(int coin : coins ){
               int res = dp(coins,amount-coin,memo);
               if(res!=Integer.MAX_VALUE){
                min = Math.min(1+res,min);
               }
            }
        memo.put(amount, min);
        return min;
       
}
}