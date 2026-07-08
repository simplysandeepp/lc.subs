public class Solution {
    public boolean isPowerOfThree(int n) {
        int maxi = 1162261467; 
        return n > 0 && maxi % n == 0;
    }
}