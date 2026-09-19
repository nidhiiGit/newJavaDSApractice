import java.util.*;

public class practiceQ4 {
    public static void reverseKelements(Queue<Integer> q, int k){
        Stack<Integer> stk = new Stack<>();
        int i=0;
        do{
            stk.push(q.remove());
            i++;
        }while(k!=i);

        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
        int n=q.size();

        for(int j=0;j<n-k; j++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseKelements(q,5);
    }
}
