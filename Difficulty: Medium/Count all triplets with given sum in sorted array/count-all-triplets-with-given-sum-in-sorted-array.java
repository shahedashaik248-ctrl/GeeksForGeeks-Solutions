class Solution {
    int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    if (arr[left] == arr[right]) {
                        int x = right - left + 1;
                        count += x * (x - 1) / 2;
                        break;
                    }

                    int a = 1;
                    int b = 1;

                    while (left + a < right && arr[left] == arr[left + a])
                        a++;

                    while (right - b > left && arr[right] == arr[right - b])
                        b++;

                    count += a * b;

                    left += a;
                    right -= b;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}