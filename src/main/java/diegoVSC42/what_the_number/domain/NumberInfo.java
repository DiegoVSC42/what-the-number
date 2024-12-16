package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.domain.properties.AdvancedNumPropertiesInfo;
import diegoVSC42.what_the_number.domain.properties.BasicNumPropertiesInfo;
import diegoVSC42.what_the_number.domain.properties.SequencePropertiesInfo;
import diegoVSC42.what_the_number.service.AdvancedNumPropertiesService;
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
    AdvancedNumPropertiesInfo advancedNumPropertiesInfo;

    public void calculateBNP(Long value) {
        BasicNumPropertiesInfo properties = new BasicNumPropertiesInfo();
        BasicNumPropertiesService basicNumPropertiesService = new BasicNumPropertiesService();

        properties.setDivisors(basicNumPropertiesService.calculateDivisors(value));
        properties.setDivisorsCount(basicNumPropertiesService.calculateDivisorsCount(properties.getDivisors()));
        properties.setTenFirstMultiples(basicNumPropertiesService.calculateMultiples(value));
        properties.setFactorial(basicNumPropertiesService.calculateFactorial(value));
        properties.setPerfect(basicNumPropertiesService.isPerfect(value, properties.getDivisors()));
        properties.setParity(basicNumPropertiesService.calculateParity(value));
        properties.setPrime(basicNumPropertiesService.isPrime(value));

        this.value = value;
        this.basicNumPropertiesInfo = properties;
    }

    public void calculateSP(Long value) {
        SequencePropertiesInfo properties = new SequencePropertiesInfo();
        SequencePropertiesService sequencePropertiesService = new SequencePropertiesService();

        properties.setFibonacciSequence(sequencePropertiesService.calculateFibonacciSequence(value));
        properties.setTriangularSequence(sequencePropertiesService.calculateTriangularSequence(value));
        properties.setSquareSequence(sequencePropertiesService.calculateSquareSequence(value));

        this.value = value;
        this.sequencePropertiesInfo = properties;
    }

    public void calculateANP(Long value) {
        AdvancedNumPropertiesInfo properties = new AdvancedNumPropertiesInfo();
        AdvancedNumPropertiesService advancedNumPropertiesService = new AdvancedNumPropertiesService();

        properties.setHarshad(advancedNumPropertiesService.calculateHarshad(value));
        properties.setPalindrome(advancedNumPropertiesService.calculatePalindrome(value));
        properties.setMersenne(advancedNumPropertiesService.calculateMersennePrime(value));

        this.value = value;
        this.advancedNumPropertiesInfo = properties;
    }

}