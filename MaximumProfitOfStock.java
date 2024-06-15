import java.util.*;

public class MaximumProfitOfStock {

    public static int MaxProfitStock(int prices[]){
        int buyingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int MaxProfit = Integer.MIN_VALUE;

        for (int i=0; i<prices.length; i++){
            if(prices[i]>buyingPrice){
                profit = prices[i]-buyingPrice;
                MaxProfit= Math.max(profit,MaxProfit);

            }else{
                buyingPrice=prices[i];
            }   

        }
        if(MaxProfit<0){
            return 0;
        }
        return MaxProfit;

    }

    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        System.out.println(MaxProfitStock(prices));
    }

    
}
