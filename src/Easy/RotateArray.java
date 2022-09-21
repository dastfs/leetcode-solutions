package Easy;

import java.util.Arrays;

//189
public class RotateArray {
    public static void rotate ( int[] nums, int k){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + k < nums.length) {
                result[i] = nums[i + k];
            } else {
                result[i] = nums[k - (nums.length - i)];
            }
        }
        nums = Arrays.copyOf(result, result.length);
        System.out.println(Arrays.toString(nums));
    }
}
