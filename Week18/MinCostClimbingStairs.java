public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }

        if (cost.length == 1) {
            return cost[0];
        }

        for (int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
