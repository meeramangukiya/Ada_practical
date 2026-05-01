import java.util.*;

public class prg10 {
    public static void main(String[] args) {
        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        int n = wt.length;

        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        System.out.println("Maximum Value: " + dp[n][W]);
    }
}
/*
Maximum Value: 9
*/
