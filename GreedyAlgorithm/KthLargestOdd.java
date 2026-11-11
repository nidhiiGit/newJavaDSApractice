//Kth largest odd number in a given range
public class KthLargestOdd {
    public static void kthLargestOddNumber(int L, int R, int K){
        int largest_odd = (R%2)==0? R-1:R;

        int ans = largest_odd - 2*(K-1);

        if(ans<L || K<=0){
            System.out.println(0);
        }else{
            System.out.println("Kth Largest odd number is: "+ans);
        }

    }
    public static void main(String args[]){
        int L=2;
        int R=11;

        int K=4;
        kthLargestOddNumber(L,R,K);
    }
    
}