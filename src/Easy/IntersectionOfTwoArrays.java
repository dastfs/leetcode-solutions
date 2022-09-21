package Easy;

import java.util.HashSet;

//#349
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
//        O(n+m)
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2) {
            if (set1.contains(i))
                set2.add(i);
        }

        //set1.retainAll(set2);
        int[] result = new int[set2.size()];
        int i = 0;
        for(int j : set2) result[i++] = j;
        return result;


//        if sorted arrays are given 0(n) and O(1) space
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
//            if (nums1[i] == nums2[j]){
//                i++; j++;
//                set.add(nums1[i]);
//            } else if (nums1[i] < nums2[j]){
//                i++;
//            } else {
//                j++;
//            }
//        }
//        return set.stream().mapToInt(i -> i).toArray();


    }
}
