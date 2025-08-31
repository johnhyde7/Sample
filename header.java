public class MaxSubarraySum {
    public static int findMaxSubarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Kadane's Algorithm: Either start a new subarray or extend the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the overall maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + maxSum); // Output: 6
    }
}
