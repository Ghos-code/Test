import java.math.BigDecimal;

public  class Operator {
    public static void Buy(BigDecimal amount,BigDecimal price,String name){
            if(amount.compareTo(price) >= 0) {System.out.println("Buying ticket for " + price + "＄");
                System.out.println("Buying ticket for " + name);
                System.out.println("Have a good day!");}
        else {System.out.println("Sry,Not enough money to buy ticket for " + price + "＄");}
    }
}
