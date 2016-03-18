public class paintHouse{
    public int mincost(int [][]cost){
    if(cost.length == 0) return 0;

    int m = cost.length;
    int n = cost[0].length;

    int[][] dp = new int[m][n];

    dp[0][1] = cost[0][1];
    dp[0][0] = cost[0][0];
    dp[0][2] = cost[0][2];

    for(int i = 1 ; i < m ; i++){
        dp[i][0] = Math.min(dp[i-1][1] + dp[i-1][2]) + cost[i][0];
        dp[i][1] = Math.min(dp[i-1][0] + dp[i-1][2]) + cost[i][1];
        dp[i][2] = Math.min(dp[i-1][1] + dp[i-1][0]) + cost[i][2];
        }

    return Math.min(dp[m-1][0], Math.min(dp[m-1][1],dp[m-1][2]));
    }
}
