package Easy;
//771
public class JewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsChars = jewels.toCharArray();
        char[] stonesChars = stones.toCharArray();

        int result = 0;
        for (int i = 0; i < stonesChars.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (jewelsChars[i] == stonesChars[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
