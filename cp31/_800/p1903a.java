package cp31._800;

public class p1903a {

    public static boolean canSort(int[] nums, int k) {
        // If k == 1, array must already be sorted
        if (k == 1) {
            return isSorted(nums);
        }

        // If k >= 2, sorting is always possible
        return true;
    }

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Optional: test cases
        int[] a = {3, 1};
        System.out.println(canSort(a, 1)); // false
    }
}
