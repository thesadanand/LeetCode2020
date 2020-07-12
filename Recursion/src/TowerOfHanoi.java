

public class TowerOfHanoi {

    private static void toh(int n, String from, String using, String to) {
        if(n>0){
            toh(n-1,"A","C","B");
            System.out.println("move disk form"  +from+"to "+to);
            toh(n-1,"C","A","B");
        }

    }

    public static void main(String[] args) {
        int noOfDics = 3;
        toh(noOfDics,"A","B","C");
    }
}
