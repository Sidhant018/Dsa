class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int profit=0;
        //TLE O(N2) time complexcity.
        // for(int i=0;i<prices.length;i++){
           //  for(int j=i+1;j<prices.length;j++){
              //   if(prices[j]>prices[i]){
                 //     profit=prices[j]-prices[i];
                    // maxprofit=Math.max(maxprofit,profit);
                 //}
            // }
        // }
        // return maxprofit;
       int lowestprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>lowestprice){
                profit=prices[i]-lowestprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            lowestprice=Math.min(prices[i],lowestprice);

        }
        return maxprofit;
    }
}