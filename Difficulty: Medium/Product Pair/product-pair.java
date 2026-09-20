class Solution {
public boolean isProduct(int[] arr, long target) {
java.util.Arrays.sort(arr);
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        long product = (long) arr[left] * arr[right];

        if (product == target)
            return true;

        if (product < target)
            left++;
        else
            right--;
    }

    return false;
}
}
