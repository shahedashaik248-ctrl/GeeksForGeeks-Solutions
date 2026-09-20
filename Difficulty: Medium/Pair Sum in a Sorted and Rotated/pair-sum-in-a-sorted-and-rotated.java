class Solution {
boolean pairInSortedRotated(int arr[], int target) {
int n = arr.length;
    int left = 0;

    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            left = i + 1;
            break;
        }
    }

    int right = left - 1;

    if (right < 0)
        right = n - 1;

    while (left != right) {
        int sum = arr[left] + arr[right];

        if (sum == target)
            return true;

        if (sum < target)
            left = (left + 1) % n;
        else
            right = (right - 1 + n) % n;
    }

    return false;
}
}
