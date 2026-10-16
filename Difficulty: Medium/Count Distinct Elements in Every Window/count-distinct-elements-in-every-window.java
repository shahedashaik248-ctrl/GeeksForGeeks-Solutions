
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        res.add(map.size());

        for (int i = k; i < arr.length; i++) {
            int x = arr[i - k];

            if (map.get(x) == 1) {
                map.remove(x);
            } else {
                map.put(x, map.get(x) - 1);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            res.add(map.size());
        }

        return res;
    }
}
