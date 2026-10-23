//Kth largest odd number in a given range
public class KthLargestOdd {
    public static void kthLargestOddNumber(int L, int R, int K){
        int largest_odd = 0;
        if(R%2==0){
            largest_odd=R;
        }else{
            largest_odd=R-1;
        }

        int count = (largest_odd-L) / 2+1;
        if(largest_odd<L || K<=0 || K>count){
            System.out.println(0);
            return;
        }
        int ans = largest_odd-2*(K-1);
        System.out.println(ans);
    }
    public static void main(String args[]){
        int L=2;
        int R=11;

        int K=4;
        kthLargestOddNumber(L,R,K);
    }
    
}