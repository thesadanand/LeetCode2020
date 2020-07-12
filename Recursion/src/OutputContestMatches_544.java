import java.util.Arrays;

public class OutputContestMatches_544 {
    static String[] str;
    public static String findContestMatch(int n) {
        if(n==1)
            return str[n-1];
        else
            for(int i=0;i<n/2;i++)
                if(str[i]!=null)
                    str[i] = "("+str[i]+","+str[n-i-1]+")";
                else
                    str[i] = "("+(i+1)+","+(n-i)+")";
        return findContestMatch(n/2);

    }

    private static String f123(int n) {
        if(n==1)
            return str[n-1];
        else
            for(int i=0;i<n/2;i++)
                if(str[i]!=null)
                    str[i] = "("+str[i]+","+str[n-i-1]+")";
                else
                    str[i] = "("+(i+1)+","+(n-i)+")";
        return f123(n/2);
    }


    public static void main(String[] args) {
        int n = 8;
        str = new String[n];
        String ans = findContestMatch(n);
        System.out.println(n+"  input"+"\toutput :: "+ans);
    }

}
