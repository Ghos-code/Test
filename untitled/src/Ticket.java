import java.math.BigDecimal;
import java.util.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String destination;
    private BigDecimal price;

    public void Buying(BigDecimal amount) {
        if (amount.compareTo(this.price) >= 0) {
            System.out.println("Buying ticket to " + this.destination + " for " + this.price);
        } else {
            System.out.println("Not enough money to buy ticket to " + this.destination);
        }
    }
}
