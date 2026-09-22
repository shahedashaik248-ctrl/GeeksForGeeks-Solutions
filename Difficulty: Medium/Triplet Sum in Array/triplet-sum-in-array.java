import java.util.*;

class Solution {
    public boolean hasTripletSum(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target)
                    return true;

                if (sum < target)
                    left++;
                else
                    right--;
            }
        }

        return false;
    }
}