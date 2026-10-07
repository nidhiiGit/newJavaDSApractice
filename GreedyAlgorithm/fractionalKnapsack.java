import java.util.Comparator;
import java.util.Arrays;

public class fractionalKnapsack {
    public static int maxTotalvalue(int value[],int weight[], int W){
        double ratioIdx[][] = new double[value.length][2];


        for(int i=0; i<ratioIdx.length; i++){
            ratioIdx[i][0] = i;
            ratioIdx[i][1] = value[i]/(double)weight[i];
        }

        //Ascending order
        Arrays.sort(ratioIdx, Comparator.comparingDouble(o -> o[1]));
        int capacity=W;
        int val=0;
        for(int i=ratioIdx.length-1; i>=0; i--){
            int idx = (int)ratioIdx[i][0];
            if(capacity > weight[idx]){//include full item
                capacity-=weight[idx];
                val+=value[idx];
            }else{
                val += (ratioIdx[i][1] * capacity); //include fractional value
                break;
            }
        }
        return val;
    }
    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};

        System.out.println("Maximum total value = "+maxTotalvalue(value,weight,50));
    }
}
