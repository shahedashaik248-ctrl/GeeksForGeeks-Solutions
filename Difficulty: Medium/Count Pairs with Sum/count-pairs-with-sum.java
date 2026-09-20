class Solution {
public int countPairs(int[] nums, int target) {
Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    int count = 0;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum < target) {
            left++;
        }
        else if (sum > target) {
            right--;
        }
        else {
            int leftValue = nums[left];
            int rightValue = nums[right];

            int leftCount = 0;
            int rightCount = 0;

            while (left <= right && nums[left] == leftValue) {
                leftCount++;
                left++;
            }

            while (left <= right && nums[right] == rightValue) {
                rightCount++;
                right--;
            }

            if (leftValue == rightValue)
                count += leftCount * (leftCount - 1) / 2;
            else
                count += leftCount * rightCount;
        }
    }

    return count;
}
}
