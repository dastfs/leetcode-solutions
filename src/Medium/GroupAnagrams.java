package Medium;

import java.util.*;

//#49
public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        // [["bat"],["nat","tan"],["ate","eat","tea"]]
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] strCh = str.toCharArray();
            Arrays.sort(strCh);
            String sortedString = String.valueOf(strCh);
            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(str);


        }
        return new ArrayList<>(map.values());
    }
}
