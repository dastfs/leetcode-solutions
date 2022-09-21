package Easy;
//58
public class LengthOfLastWord {
    public int lengthOfLastWord(String str) {
        String s = str.trim();
        int a = 0;
        if (s.length() == 0)
            return a;

        for(int i = s.length()-1; i >= 0; i-- ){
            if (s.charAt(i) == ' ')
                return s.length()-1-i;

        }
        return s.length();
    }
}
