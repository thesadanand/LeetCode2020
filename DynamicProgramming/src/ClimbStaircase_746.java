/**
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 * Once you pay the cost, you can either climb one or two steps.
 * You need to find minimum cost to reach the top of the floor,
 * and you can either start from the step with index 0, or the step with index 1.
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 */

public class ClimbStaircase_746 {

    public static int minCostClimbingStairs(int[] cost) {

        for(int i=2;i<cost.length;i++)
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20,10,12};
        System.out.println(" "+minCostClimbingStairs(cost));
    }
}
