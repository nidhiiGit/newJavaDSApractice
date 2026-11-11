// lexicographically Smallest String of length N and sum K
public class lexicographicallySmallest {
    public static void main(String[] args) {
        int N=3;
        int K=25;

        char c[]=new char[N];

        for(int i=0;i<c.length; i++){
            c[i]='a';
        }

        int remaining = K-N;
        for(int i=c.length-1; i>=0; i--){
            int add = Math.min(25,remaining); 
            c[i] = (char)(c[i]+add);
            remaining -= add; 
        }

        System.out.println(new String(c));
    }
}
