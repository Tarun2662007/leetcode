class Solution {
    public boolean canAliceWin(int n) {
        boolean[] dp = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = false;
        }

        // Alice must remove exactly 10 stones first
        if (n < 10) {
            return false;
        }

        return win(n, 10);
    }

    private boolean win(int n, int remove) {
        if (n < remove) {
            return false;
        }

        return !win(n - remove, remove - 1);
    }
}

