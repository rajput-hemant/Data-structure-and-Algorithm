package dynamicprogramming;

public class PrintTheLongestCommonSubsequence {
  public void printlcs(String str1, String str2) {
    int m = str1.length(),
        n = str2.length();
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i < m + 1; i++)
      for (int j = 0; j < n + 1; j++) {
        if (i == 0 || j == 0)
          dp[i][j] = 0;
        else if (str1.charAt(i - 1) == str2.charAt(j - 1))
          dp[i][j] = 1 + dp[i - 1][j - 1];
        else
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
      }
    int i = m, j = n;
    StringBuilder sb = new StringBuilder();
    while (i > 0 && j > 0) {
      if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
        sb.append(str1.charAt(i - 1));
        i--;
        j--;
      } else if (dp[i - 1][j] > dp[i][j - 1])
        i--;
      else
        j--;
    }
    System.out.println(sb.reverse());
  }

  public static void main(String[] args) {
    PrintTheLongestCommonSubsequence ob = new PrintTheLongestCommonSubsequence();
    ob.printlcs("AXYZ", "BAZ");
  }
}
