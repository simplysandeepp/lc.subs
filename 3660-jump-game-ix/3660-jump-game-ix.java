class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n], suf = new int[n], res = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) 
            pre[i] = Math.max(pre[i - 1], nums[i]);
        suf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) 
            suf[i] = Math.min(suf[i + 1], nums[i]);
        res[n - 1] = pre[n - 1];
        for (int i = n - 2; i >= 0; i--) 
            res[i] = pre[i] > suf[i + 1] ? res[i + 1] : pre[i];
        return res;
    }
}