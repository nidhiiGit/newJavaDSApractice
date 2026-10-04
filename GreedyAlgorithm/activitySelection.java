import java.util.ArrayList;

public class activitySelection {
    public static int totalActivitySelection(int start[], int end[]){
        int maxAct=1;//we will always take the 1st activity(considering the array is sorted and 1st activity will be the shortest).
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1; i<end.length; i++){
            if(lastEnd <= start[i]){
                ans.add(i);
                lastEnd=end[i];
                maxAct++;
            }
        }
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
        System.out.println();
        return maxAct;
    }
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        System.out.println("Max activities = "+totalActivitySelection(start,end));

    }
}
