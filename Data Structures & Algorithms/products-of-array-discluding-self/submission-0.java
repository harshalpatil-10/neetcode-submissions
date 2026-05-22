class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int curr_product = 1;
        for (int i = 0; i < n; i++) {
            output[i] = curr_product; // Step 1: Drop the current left-product in
            curr_product *= nums[i]; // Step 2: Update it for the next element
        }
       
            curr_product = 1;
            // We start at the last index (n-1) and stop after index 0
            for (int i = n - 1; i >= 0; i--) {
                output[i] *= curr_product;
                curr_product *= nums[i];
            }
            return output;
        }
    }
