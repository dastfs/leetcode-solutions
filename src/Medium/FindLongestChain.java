package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestChain {
    public static int findLongestChain(int[][] pairs) {

        if(pairs.length < 1){
            return 0;
        }

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int max = 1;
        for (int i = 0; i < pairs.length; i++) {
            int result = 1;
            for (int j = 1; j < pairs.length; j++) {
                if (pairs[i][1] < pairs[j][0]) {
                    result++;
                }
            }
            max = Math.max(max, result);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] pairs = new int[][]{{-10, -8}, {8, 9}, {-5, 0}, {6, 10}, {-6, -4}, {1, 7}, {9, 10}, {-4, 7}};
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        for(int i = 0; i < pairs.length; i++){
            System.out.print(Arrays.toString(pairs[i]) + " ");
        }

        //[[-10,-8],[8,9],[-5,0],[6,10],[-6,-4],[1,7],[9,10],[-4,7]]
        //System.out.println(findLongestChain(pairs));
    }
}
