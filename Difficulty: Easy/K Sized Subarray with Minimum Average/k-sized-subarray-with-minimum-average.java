
class Solution {
    public int leastAvg(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int min = sum;
        int index = 0;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum < min) {
                min = sum;
                index = i - k + 1;
            }
        }

        return index + 1;
    }
}
