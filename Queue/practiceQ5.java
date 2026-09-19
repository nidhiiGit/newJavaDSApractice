public class practiceQ5 {
    public static void MaximumOfSubArrs(int arr[], int n, int k){
        for(int i=0; i<=n-k; i++){
            int max=Integer.MIN_VALUE;
            int j=i;
            int h=0;
            while(h<k){
                max=Math.max(max, arr[j]);
                j++;
                h++;
            }
            System.out.print(max +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        MaximumOfSubArrs(arr,8, 3);
    }
}
