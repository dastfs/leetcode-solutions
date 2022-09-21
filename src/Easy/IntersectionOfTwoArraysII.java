package Easy;

import java.util.ArrayList;
import java.util.HashMap;

//#350
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[]num1 = {1, 2, 2, 3, 3, 4};
        int[]num2 = {1, 2, 3, 4, 5, 3};

        intersection(num1, num2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i,0);
            map.put(i, freq + 1);
        }
        System.out.println(map);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        System.out.println(list);
        int []result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
            System.out.print(result[i]);
        }
        return result;
    }
}
