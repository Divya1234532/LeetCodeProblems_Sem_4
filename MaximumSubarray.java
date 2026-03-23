class Solution {
    public int maxSubArray(int[] nums) {
        /*int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;*/
        //bruteForce method
        int cur=0,max=nums[0];
        for (int i:nums)
        {
            cur+=i;
            if(cur>max)
            {
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;


    }
}
