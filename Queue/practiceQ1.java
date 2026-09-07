import java.util.*;

public class practiceQ1 {
    public static void generateBinary(int n){
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        for(int i=1; i<=n; i++){
            String current = q.poll();
            System.out.print(current + " ");

            q.add(current + "0");
            q.add(current + "1");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        generateBinary(7);
    }
}
