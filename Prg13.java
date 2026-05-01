import java.util.*;

public class prg13 {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length(), n = s2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++)
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);

        System.out.println("Length of SCS: " + dp[m][n]);
    }
}
/*
Length of SCS: 9
*/
