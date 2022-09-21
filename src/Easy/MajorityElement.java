package Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elementsCounterMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(elementsCounterMap.containsKey(nums[i])){
                elementsCounterMap.put(nums[i], elementsCounterMap.get(nums[i]) + 1);
            } else {
                elementsCounterMap.put(nums[i], 1);
            }
        }
        System.out.println(elementsCounterMap);
        int max = 0;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer> entry : elementsCounterMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getValue());
            if(max < entry.getValue()){
                max = entry.getValue();
                maxKey = entry.getKey();
                System.out.println(max);
            }
        }

        return maxKey;

    }
}
