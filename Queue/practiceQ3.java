import java.util.*;
class Job{
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}

public class practiceQ3 {
    public static void main(String[] args) {
        Job[] jobs={
            new Job('a', 4, 20),
            new Job('b', 1, 10),
            new Job('c', 1, 40),
            new Job('d', 1, 30)
        };

        Arrays.sort(jobs , (a,b) ->b.profit-a.profit);

        int maxDeadline=Integer.MIN_VALUE;
        for(Job job: jobs){
            maxDeadline=Math.max(job.deadline, maxDeadline);
        }

        char schedule[] = new char[maxDeadline+1];
        Arrays.fill(schedule, '-');

        int totalProfit=0;
        for(Job job:jobs){
            for(int slot=job.deadline; slot>=1; slot--){
                if(schedule[slot]=='-'){
                    schedule[slot]=job.id;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }

        System.out.println("Jobs: ");

        for(int i=1; i<=maxDeadline; i++){
            if(schedule[i]!='-'){
                System.out.print(schedule[i]+ " ");
            }
        }

        System.out.println();
        System.out.println("Max profit :" +totalProfit);
    }
}
