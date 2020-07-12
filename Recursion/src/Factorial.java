
public class Factorial {

    public static long recFactorial(int n){
        if(n==0 || n==1)
            return n;
        else
            return n*recFactorial(n-1);
    }

    public static void main(String[] args) {
        int input = 9;
        Long fact = recFactorial(input);
        System.out.println(input+" ! == "+fact);
    }
}
