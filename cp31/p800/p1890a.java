package cp31.p800;

import java.util.HashMap;

public class p1890a {
    public String goodArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (map.size() >= 3) {
            return "No";
        }
        if (map.size() == 1) {
            return "Yes";
        }
        int index = 0;
        int[] arr = new int[2]; // stores frequencies of 2 distinct values
        for (int freq : map.values()) {
            arr[index++] = freq;
        }

        return Math.abs(arr[1] - arr[0]) == 0 ? "Yes" : "No";

    }

    public static void main(String[] args) {
  System.out.println();
    }

}
