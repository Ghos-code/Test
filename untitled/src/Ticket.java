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
}
