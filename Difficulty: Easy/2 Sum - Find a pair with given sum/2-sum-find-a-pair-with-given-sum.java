class Solution {
public List<Integer> twoSum(int[] nums, int target) {
List<Integer> ans = new ArrayList<>();
    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
            ans.add(nums[left]);
            ans.add(nums[right]);
            return ans;
        }

        if (sum < target)
            left++;
        else
            right--;
    }

    return ans;
}
}
