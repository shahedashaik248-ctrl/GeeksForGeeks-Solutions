class Solution {
int countPairs(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;
int count = 0;
    while (left < right) {
        int sum = arr[left] + arr[right];

        if (sum == target) {
            if (arr[left] == arr[right]) {
                int n = right - left + 1;
                count += n * (n - 1) / 2;
                break;
            }

            int leftValue = arr[left];
            int rightValue = arr[right];

            int leftCount = 0;
            int rightCount = 0;

            while (left <= right && arr[left] == leftValue) {
                leftCount++;
                left++;
            }

            while (right >= left && arr[right] == rightValue) {
                rightCount++;
                right--;
            }

            count += leftCount * rightCount;
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
