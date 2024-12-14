package diegoVSC42.what_the_number.domain.properties;

import diegoVSC42.what_the_number.domain.Parity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicNumPropertiesInfo {

    private List<Long> divisors;
    private Long divisorsCount;
    private List<Long> tenFirstMultiples;
    private Long factorial;
    private Parity parity;
    private boolean isPerfect;
    private boolean isPrime;
}
