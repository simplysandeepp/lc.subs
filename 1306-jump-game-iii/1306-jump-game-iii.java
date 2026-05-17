class Solution {
    public boolean canReach(int[] arr, int start) {
        return solve(arr, start);
    }
    private boolean solve(int[] arr, int i){
        int n = arr.length;
        if(i<0 || i>=n || arr[i] < 0) {
            return false;
        }
        if(arr[i] == 0) return true;
        arr[i] *= -1;
        boolean a = solve(arr, i+arr[i]);
        boolean b = solve(arr, i-arr[i]);
        return a || b;
    }
}