public class bestSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int bestBuy=prices[0];
        int maxProfit=0;
        for(int i=1; i<prices.length; i++){
            if(bestBuy > prices[i]){
                bestBuy=prices[i];
            }else if((prices[i]-bestBuy)>maxProfit){
                maxProfit = prices[i]-bestBuy;
            }
        }
        System.out.println(maxProfit);
    }
}
