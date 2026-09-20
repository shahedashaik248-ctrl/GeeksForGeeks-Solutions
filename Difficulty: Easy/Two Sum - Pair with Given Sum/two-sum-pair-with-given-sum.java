class Solution {
boolean twoSum(int arr[], int x) {
Arrays.sort(arr);
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];

        if (sum == x)
            return true;

        if (sum < x)
            left++;
        else
            right--;
    }

    return false;
}
}
