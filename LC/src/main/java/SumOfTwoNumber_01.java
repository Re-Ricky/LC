public class SumOfTwoNumber_01 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length && nums[i] < target; i++) {
            for (int j = i+1; j < nums.length && nums[j] < target; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SumOfTwoNumber_01 st = new SumOfTwoNumber_01();
        int i = 6;
        int[] arr = {3, 2, 4};
        System.out.println(st.twoSum(arr, i));


    }
}

