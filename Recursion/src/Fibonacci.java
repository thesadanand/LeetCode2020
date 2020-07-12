

public class Fibonacci {

    private static int recursiveFico(int n) {
        if((n==1) || (n==2))
            return 1;
        else
            return recursiveFico(n-1)+ recursiveFico(n-2);
    }

    public static void main(String[] args) {
        int n = 7;
        int fibo = recursiveFico(n);
        System.out.println(n+"th fibonacci term :: "+fibo);
    }
}
//1 1 2 3 5 8