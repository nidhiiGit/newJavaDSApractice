import java.util.ArrayList;

public class pascalsTriangle{
    public static void main(String[] args) {
        int ans[][] =new int[5][5];
        int n=5;
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    ans[i][j]=1;
                }else{
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
            }
        }

        System.out.println("Pascal's traingle: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}