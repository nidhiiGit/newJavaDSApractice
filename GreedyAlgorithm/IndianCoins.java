import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static int minCoins(Integer coins[], int val){
        int ans=0;
        for(int i=0; i<coins.length; i++){
            if(coins[i] <= val){
                while(coins[i] <= val){
                    val-=coins[i];
                    ans++;
                }
            }else{
                continue;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int val = 590;
        System.out.println("Minimum number of coins/notes : " +minCoins(coins,val));
    }
}
