class Solution {
    public int maxProfit(int[] prices) {
        int[] profits = new int[prices.length];
        int least = prices[0];
        for(int i=0;i<profits.length;i++){
            if(least>prices[i]) 
                least=prices[i];
            profits[i] = prices[i]-least;
        }
        return (int)Arrays.stream(profits).map(i->(Integer)i).max().getAsInt();
    }
}