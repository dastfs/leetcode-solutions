package Easy;
//26
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
