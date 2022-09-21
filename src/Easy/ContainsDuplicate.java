package Easy;

import java.util.HashSet;
import java.util.Set;

//217
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.contains(nums);
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
