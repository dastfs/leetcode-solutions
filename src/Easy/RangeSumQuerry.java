package Easy;

// #303
public class RangeSumQuerry {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(0,5));
    }
}

class NumArray {

    int[] nums;

    public NumArray(int[] nums) {

        this.nums = nums;
    }

    public int sumRange(int l, int r) {

        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        if(l == 0)
            return nums[r];

        return nums[r] - nums[l - 1];
    }
}