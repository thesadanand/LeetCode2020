/**
 * 8.36
 */

public class IsSubsequence_392 {

    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()||s.isBlank())
            return  true;
        int index =0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(index)==t.charAt(i))
                index++;
            if(index==s.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
       System.out.println(" "+isSubsequence("abc","ahbgdc"));
        System.out.println(" "+isSubsequence("axc","ahbgdc"));
        System.out.println(" "+isSubsequence("","ahbgdc"));
        System.out.println(" "+isSubsequence("b","c"));
    }
}
