import java.util.*;
public class BuyAndSellStocks {

    public static int BuyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ // profit

                int profit = prices[i] - buyPrice; //today's profit
                maxPrice= Math.max(maxPrice,profit);

            }else{
                buyPrice = prices[i];
            }

        }
        return maxPrice;
    }
    
    public static void main(String args[]){
        int prices[] ={7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(prices));
    }


    
}
