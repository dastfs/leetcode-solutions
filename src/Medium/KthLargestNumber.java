package Medium;

import java.util.Arrays;

//215
public class KthLargestNumber {
    //O(n*log(n)) because of Arrays.sort
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
