import java.util.*;
public class Leet121_BestTimeStocks {
    // arary is given of price 
    // where we will traverse the array by checking if we by a stocks one day and sell it on other day what is the maximum profit we will gain
    // which is the best day to buy we want to calculate and return how much profit we gain .
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of the array:");
     int size=sc.nextInt();

     int prices[]=new int[size];
      for(int i=0;i<size;i++){
        prices[i]=sc.nextInt();
      }

      stocks(prices);
      
    }
    public static int stocks(int prices[]){

        int maxProfit=0;
        int Profit=0;

        for(int i=0;i<prices.length;i++){
           for(int j=i+1;j<prices.length;j++){
            Profit=prices[j]-prices[i];
           maxProfit=Math.max(maxProfit,Profit);
           }
        }
        System.out.println("maximum profit:" + maxProfit);
        return maxProfit;
        

    }
    
    
}
