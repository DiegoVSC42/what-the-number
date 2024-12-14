package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.service.BasicNumPropertiesService;
import diegoVSC42.what_the_number.service.SequencePropertiesService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
        BasicNumPropertiesService basicNumPropertiesService = new BasicNumPropertiesService();

        properties.setDivisors(basicNumPropertiesService.calculateDivisors(value));
        properties.setDivisorsCount(basicNumPropertiesService.calculateDivisorsCount(properties.getDivisors()));
        properties.setTenFirstMultiples(basicNumPropertiesService.calculateMultiples(value));
        properties.setFactorial(basicNumPropertiesService.calculateFactorial(value));
        properties.setPerfect(basicNumPropertiesService.isPerfect(value, properties.getDivisors()));
        properties.setParity(basicNumPropertiesService.calculateParity(value));
        properties.setPrime(basicNumPropertiesService.isPrime(properties.getDivisorsCount()));

        this.value = value;
        this.basicNumPropertiesInfo = properties;
    }

    public void calculateSP(Long value){
        SequencePropertiesInfo properties = new SequencePropertiesInfo();
        SequencePropertiesService sequencePropertiesService = new SequencePropertiesService();

        properties.setFibonacciSequence(sequencePropertiesService.calculateFibonacciSequence(value));
        properties.setTriangularSequence(sequencePropertiesService.calculateTriangularSequence(value));
        this.value = value;
        this.sequencePropertiesInfo = properties;
    }

}