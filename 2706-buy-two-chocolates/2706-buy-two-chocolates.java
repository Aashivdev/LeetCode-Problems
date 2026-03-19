class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int count=0;
        int ans=money;
        for(int i = 0;i<prices.length;i++){
            int amt = prices[i];
            if(amt<=money){
                count++;
                money=money-amt;
            }
            if(count==2 && money>=0){
                return money;
            }
        }return ans;
    }
}