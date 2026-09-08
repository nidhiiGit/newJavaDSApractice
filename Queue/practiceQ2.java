import java.util.PriorityQueue;

public class practiceQ2 {
    public static int calculateMinCost(int ropes[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num:ropes){
            pq.add(num);
        }
        System.out.println(pq.size());
        int res=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            res+=first+second;
            pq.add(first+second);
        }
        return res;
    }
    public static void main(String[] args) {
        int ropes[] = {4,3,2,6};
        int n=ropes.length;

        calculateMinCost(ropes,n);
    }
}
