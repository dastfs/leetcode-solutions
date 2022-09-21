package Easy;

public class PalindromCheck {
    public static boolean isPalindrome(String str){
        char[] strArray = str.toCharArray();

        if(str.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if(strArray[i] != strArray[str.length() - 1 - i])
                    return false;
            }
        }

        return true;
    }
}
