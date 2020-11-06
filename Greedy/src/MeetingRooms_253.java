import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...]
 * find the minimum number of conference rooms required.
 */

public class MeetingRooms_253 {

    public static int minMeetingRooms(int[][] intervals) {
        //[[2, 15], [36, 45], [9, 29], [16, 23], [4, 9]]
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[1]);
            } else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }
                heap.offer(itv[1]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[][] arr = {{0, 30},{5, 10},{15, 20}};
        int[][] arr = {{2, 15},{36, 45},{9, 29},
                        {16,23},{4,9}
                      };
        System.out.println("after sorting "+Arrays.deepToString(arr));
        System.out.println(" "+minMeetingRooms(arr));

        Arrays.sort(arr, Comparator.comparing((int[] val)->val[1]));
        System.out.println("after sorting "+Arrays.deepToString(arr));
    }
}