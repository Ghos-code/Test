import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    private String name;
    private int age;
    private String gender;
    private BigDecimal amount;
}


