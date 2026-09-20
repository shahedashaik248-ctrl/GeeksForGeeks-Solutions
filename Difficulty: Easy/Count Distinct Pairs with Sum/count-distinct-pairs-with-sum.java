class Solution {
public int countDistinctPairs(int[] nums, int target) {
Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    int count = 0;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
            count++;

            int leftValue = nums[left];
            int rightValue = nums[right];

            while (left < right && nums[left] == leftValue)
                left++;

            while (left < right && nums[right] == rightValue)
                right--;
        }
        else if (sum < target) {
            left++;
        }
        else {
            right--;
        }
    }

    return count;
}
}
