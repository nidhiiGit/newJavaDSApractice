import java.util.*;

public class jobScheduling {
    static class Job{
        int id;
        int deadline;
        int profit;

        Job(int i, int d, int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs , (a,b) -> b.profit-a.profit);

        ArrayList<Integer> ans  = new ArrayList<>();
        int time = 0;
        int maxProfit=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                ans.add(curr.id);
                time+=curr.deadline;
                maxProfit+=curr.profit;
            }
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();

        System.out.println("Maximum profit = " +maxProfit);
    }
}
