package Easy;

import java.util.Arrays;


public class ThirdMax {
    public int thirdMax(int[] nums) {
        if (nums.length < 3)
            return nums[nums.length-1];

        Arrays.sort(nums);
//        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(nums));
//        Integer[] numbersWithoutDuplicates = set.toArray(new Integer[] {});

        return 1;
    }
}
