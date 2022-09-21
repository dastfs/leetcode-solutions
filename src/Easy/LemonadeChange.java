package Easy;
//860
public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int i:bills){
            if(i == 5){
                five +=5;
            } else if(i == 10 && (five - 5) >= 0){
                ten +=10;
                five -= 5;
            } else if(i == 20) {
                if(ten - 10 >= 0 && five - 5 >= 0){
                    twenty +=20;
                    ten-=10;
                    five-=5;
                }else if(five - 15 >= 0){
                    twenty +=20;
                    five-=15;
                } else return false;
            } else
                return false;
        }
        return true;
    }
}
