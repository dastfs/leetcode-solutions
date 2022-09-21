package Easy;
//125
public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if(s.length() == 0)
            return true;

        char[] newString = s.toCharArray();

        for (int i = 0; i < newString.length; i++) {
            if(newString[i] != newString[newString.length - 1 - i])
                return false;
        }

        return true;
    }
}
