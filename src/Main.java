public class Main {
    public static int majotorial(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int x : nums) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int x : nums) {
            if (x == candidate) cnt++;
        }
        if (cnt > nums.length / 2) {
            return candidate;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4, 2, 1, 2, 2};
        System.out.println(majotorial(nums));
    }
}
