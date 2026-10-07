import java.util.Arrays;

public class absoluteDiff {
    public static int minimumAbsoluteDiff(int A[], int B[]){
        Arrays.sort(A);
        Arrays.sort(B);

        int absDiff=0;
        for(int i=0; i<A.length; i++){
            absDiff += Math.abs(A[i]-B[i]);
        }
        return absDiff;
    }
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        System.out.println("Minimum absolute difference : "+minimumAbsoluteDiff(A,B));
    }
}
