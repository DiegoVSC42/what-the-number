package diegoVSC42.what_the_number.domain;

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

    List<Long> divisors;
    Long divisorsCount;
    List<Long> tenFirstMultiples;
    Long factorial;
    Parity parity;
    boolean isPerfect;
    boolean isPrime;
}
