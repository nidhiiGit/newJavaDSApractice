public class fibo {
    public static int Fibonacci(int n, int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n] = Fibonacci(n-1,f) + Fibonacci(n-2,f);
        return f[n];
    }
    public static void main(String[] args) {
        int n=5;
        int f[]=new int[n+1];
        System.out.println(Fibonacci(n,f));
    }
}
