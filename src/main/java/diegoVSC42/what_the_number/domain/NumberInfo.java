package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.service.BasicNumPropertiesService;
import diegoVSC42.what_the_number.service.SequencePropertiesService;
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
    BasicNumPropertiesInfo basicNumPropertiesInfo;
    SequencePropertiesInfo sequencePropertiesInfo;

    public void calculateBNP(Long value){
        BasicNumPropertiesInfo properties = new BasicNumPropertiesInfo();
        BasicNumPropertiesService bnps = new BasicNumPropertiesService();

        properties.setDivisors(bnps.calculateDivisors(value));
        properties.setDivisorsCount(bnps.calculateDivisorsCount(properties.getDivisors()));
        properties.setTenFirstMultiples(bnps.calculateMultiples(value));
        properties.setFactorial(bnps.calculateFatorial(value));
        properties.setPerfect(bnps.isPerfect(value, properties.getDivisors()));
        properties.setParity(bnps.calculateParity(value));
        properties.setPrime(bnps.isPrime(properties.getDivisorsCount()));

        this.value = value;
        this.basicNumPropertiesInfo = properties;
    }

    public void calculateSP(Long value){
        SequencePropertiesInfo properties = new SequencePropertiesInfo();
        SequencePropertiesService sps = new SequencePropertiesService();

        properties.setFibonacciSequence(sps.calculateFibonacciSequence(value));

        this.value = value;
        this.sequencePropertiesInfo = properties;
    }

}