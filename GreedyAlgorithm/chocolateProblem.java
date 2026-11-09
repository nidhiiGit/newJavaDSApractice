import java.util.Arrays;
import java.util.Collections;

public class chocolateProblem {
    public static void main(String[] args) {
        // int n=4, m=6;
        Integer horCost[]= {4,1,2};
        Integer vertCost[]={2,1,3,1,4};

        Arrays.sort(horCost, Collections.reverseOrder());
        Arrays.sort(vertCost, Collections.reverseOrder());

        int v=0, h=0;
        int vp=1, hp=1;
        int cost = 0;
        while(v<vertCost.length && h<horCost.length){
            if(vertCost[v] <= horCost[h]){
                cost += (horCost[h]*vp);
                hp++;
                h++;
            }else{
                cost += (vertCost[v]*hp);
                vp++;
                v++;
            }
        }

        while(v<vertCost.length){
            cost += (vertCost[v]*hp);
            vp++;
            v++;
        }

        while(h<horCost.length){
            cost += (horCost[h]*vp);
            hp++;
            h++;
        }

        System.out.println("Minimum cost of breaking the whole chocolate into single Squares : "+cost);
    }
}
