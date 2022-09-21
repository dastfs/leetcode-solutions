package Easy;

import java.util.Optional;
import java.util.Random;

public class ReverseInteger {
    public static void main(String[] args) {

        String name = Optional.ofNullable(getName()).orElseThrow(NullPointerException::new);
        System.out.println(name);
    }

    private static String getName() {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println(a);
        if (a % 2 == 0) {
            return "John";
        } else return null;
    }
}
