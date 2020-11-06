import java.util.Arrays;

/**
 * 135. Candy
 * 7.30
 *
 */


public class Candy_135 {

    public static int candy(int[] ratings) {
        int[] leftArr = new int[ratings.length];
        int[] rightArr = new int[ratings.length];

        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1]) {
                leftArr[i] = 1;
                leftArr[i + 1] = 2;
            }else if(ratings[i]==ratings[i+1]){
                leftArr[i+1] = (leftArr[i] == 1 ? 2:1);
            }else {
                leftArr[i] = 2;
                leftArr[i+1] = 1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                rightArr[i] = 1;
                rightArr[i-1] = 2;
            }else if(ratings[i]==ratings[i-1]){
                leftArr[i-1] = (leftArr[i] == 1 ? 2:1);
            }else {
                rightArr[i] = 2;
                rightArr[i-1] = 1;
            }
        }
        int sum=0;
        System.out.println("left Array:: "+ Arrays.toString(leftArr));
        System.out.println("right Array:: "+ Arrays.toString(rightArr));
        for(int i=0;i<ratings.length;i++)
            sum += Math.max(leftArr[i],rightArr[i]);
        return sum;
    }


    public static void main(String[] args) {
        int[] input = {1,0,2};
//        int[] input = {1,2,2};

//        int[] input ={1,3,2,2,1};
        int out = candy(input);
        System.out.println(Arrays.toString(input)+":: "+out);
    }
}
