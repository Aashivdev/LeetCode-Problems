class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int ans = 0;
            if (k > 0) {
                for (int m = 1; m <= k; m++) {
                    ans += code[(i + m) % n];
                }
                res[i] = ans;
            } else if (k < 0) {
                int r = (i == 0) ? n : i; 
                for (int m = 1; m <= -k; m++) {
                    ans += code[--r];
                    if (r == 0) {
                        r = n; 
                    }
                }
                res[i] = ans;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}