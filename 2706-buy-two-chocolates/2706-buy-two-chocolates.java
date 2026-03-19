class Solution {
    public int buyChoco(int[] prices, int amt) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];
        if(cost<=amt){
            return amt-cost;
        }
        else{
            return amt;
        }
    }

}