package Medium;

import java.util.Arrays;

//#179
public class LargestNumber {
    public static void main(String[] args) {
        int[] num = new int[]{3,30,34,5,9};
        System.out.println(largestNumber(num));
    }

    static String largestNumber(int[] num){

        String[] strArr = new String[num.length];
        for(int i = 0; i<num.length; i++){
            strArr[i] = String.valueOf(num[i]);
        }

        Arrays.sort(strArr, (a, b) -> {
            String str1 = a + b;
            String str2 = b + a;
            return str2.compareTo(str1);
        });

        if(strArr[0].equals("0")){
            return "0";
        }

        String result = "";
        for(String str : strArr){
            result += str;
        }

        return result;


    }
}


