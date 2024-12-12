package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.service.BasicNumProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NumberInfo {

    // BASIC NUMERICAL PROPERTIES
    Long value;
    List<Long> divisors;
    Long divisorsCount;
    List<Long> tenFirstMultiples;
//    Long factorial;
//    Parity parity;
//    boolean isPrime;
//    boolean isPerfect;

    public void calculate(Long value){
        BasicNumProperties bnp = new BasicNumProperties();

        this.value = value;
        this.divisors = bnp.divisors(value);
        this.divisorsCount = bnp.divisorsCount(this.divisors);
        this.tenFirstMultiples = bnp.multiples(value);
    }
}
