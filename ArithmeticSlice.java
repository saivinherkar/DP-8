//TC = O(n)
//SC = O(n)
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length==0 || nums == null) return 0;
        int dp[] = new int[nums.length];
        int result = 0;
        for(int i=2; i<nums.length; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                dp[i] = dp[i-1] + 1;
                result += dp[i];
            }
        }
        return result;
    }
}