import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        Passenger pa = new Passenger("牢a",19,"男",new BigDecimal(10.0));
        Operator op = new Operator();
        Ticket tic = new Ticket("US",new BigDecimal(100.0));
        op.Buy(pa.getAmount(),tic.getPrice(),tic.getDestination());
    }
}
