package calculation;

import java.math.BigDecimal;
//https://javarush.ru/groups/posts/2274-kak-ispoljhzovatjh-bigdecimal-v-java
public class Example {
    public static void main(String[] args) {
 BigDecimal bd = new BigDecimal("1.555");

        bd=bd.setScale(1,BigDecimal.ROUND_CEILING);
        System.out.println(bd);

        BigDecimal b1 = new BigDecimal("1.5");
        BigDecimal b2 = new BigDecimal("1.500");
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
    }
}
