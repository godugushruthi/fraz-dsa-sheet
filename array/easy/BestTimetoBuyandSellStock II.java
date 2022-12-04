// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
/* DESCRIPTION :
Here we are given prices of stocks on each i th day we need to find maximum profit for them.
INPUT :[7 1 5 3 6 4]
OUTPUT : 7
APPROACH : Here we can buy the stock on day 2 i.e for costprice=1 and sell it on day 3 i.e sp=5 p=4 again we can buy the stock on day 4 i.e cp=3 and sell it on day 5
sp=6 p=3 totalprofit would be sum of this both totalprofit=4+3=7 
here we can understand that if we buy it on day 2 for cp=1 and we can sell it on day 3 or 4 or 5 or 6 but out of this if we sell it on day 3 we get more profit.hence p=4
similarly now if we buy stock on day 4 cp=3 then we can sell it on day 5 or 6 but we can get more profit on day 5 sp=6 p=3 by this it is clear that we need to find out 
the sum of 2 maximum profits which we can obtain from two different cp and sp.
APPROACH : 
   
  
  
  
*/

  class Solution 
  {
    public int maxProfit(int[] prices)
    {
        int p=0;
      for(int i=1;i<prices.length;i++)
      {
          if(prices[i]>prices[i-1])
           p+=prices[i]-prices[i-1];

      }    
      return p;
    }
 }

