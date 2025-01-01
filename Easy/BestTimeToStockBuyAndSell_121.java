
/**
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

 * 
 */


class BestTimeToStockBuyAndSell_121{

    public int maxProfitBrute(int[] a){
        int maxProfit=0;
        for (int i=0; i<a.length; i++){
            for( int j=i+1; j<a.length; j++){
                maxProfit=Math.max(maxProfit, a[j]-a[i]);
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] a){
        int maxProfit=0;
        int left=0;
        int right=a.length-1;

        for(int i=1; i<=right; i++){
            // int currentProfit=0;
            if(a[left]>a[i]){
                left=i;
            }
            maxProfit=Math.max(maxProfit,a[i]-a[left]);

        }
        return  maxProfit;
       


    }


    public static void main(String[] args) {  
       BestTimeToStockBuyAndSell_121 obj=new BestTimeToStockBuyAndSell_121();
        int[] a=new int[] {3, 1, 6, 2,0,6};
        System.err.println("Max Profit: "+ obj.maxProfitBrute(a));
        System.err.println("Max Profit: "+ obj.maxProfit(a));
    }

}