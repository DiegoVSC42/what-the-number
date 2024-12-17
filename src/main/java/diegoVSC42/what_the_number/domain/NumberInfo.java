package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.domain.properties.*;
import diegoVSC42.what_the_number.service.*;
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
    DigitBasedOperationsInfo digitBasedOperationsInfo;
    AlternativeRepresentationsInfo alternativeRepresentationsInfo;

    public void calculateBasicNumberProperties(Long value) {
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

    public void calculateSequencesProperties(Long value) {
        SequencePropertiesInfo properties = new SequencePropertiesInfo();
        SequencePropertiesService sequencePropertiesService = new SequencePropertiesService();

        properties.setFibonacciSequence(sequencePropertiesService.calculateFibonacciSequence(value));
        properties.setTriangularSequence(sequencePropertiesService.calculateTriangularSequence(value));
        properties.setSquareSequence(sequencePropertiesService.calculateSquareSequence(value));

        this.value = value;
        this.sequencePropertiesInfo = properties;
    }

    public void calculateAdvancedNumberProperties(Long value) {
        AdvancedNumPropertiesInfo properties = new AdvancedNumPropertiesInfo();
        AdvancedNumPropertiesService advancedNumPropertiesService = new AdvancedNumPropertiesService();

        properties.setHarshad(advancedNumPropertiesService.calculateHarshad(value));
        properties.setPalindrome(advancedNumPropertiesService.calculatePalindrome(value));
        properties.setMersenne(advancedNumPropertiesService.calculateMersennePrime(value));

        this.value = value;
        this.advancedNumPropertiesInfo = properties;
    }

    public void calculateDigitBasedOperations(Long value) {
        DigitBasedOperationsInfo properties = new DigitBasedOperationsInfo();
        DigitBasedOperationsService digitBasedOperationsService = new DigitBasedOperationsService();

        properties.setNumberOfDigits(digitBasedOperationsService.calculateNumberOfDigits(value));
        properties.setDigitSum(digitBasedOperationsService.calculateDigitSum(value));
        properties.setDigitProduct(digitBasedOperationsService.calculateDigitProduct(value));
        this.value = value;
        this.digitBasedOperationsInfo = properties;
    }

    public void calculateAlternativeRepresentations(Long value) {
        AlternativeRepresentationsInfo properties = new AlternativeRepresentationsInfo();
        AlternativeRepresentationsService alternativeRepresentationsService = new AlternativeRepresentationsService();

        properties.setBinary(alternativeRepresentationsService.calculateBinary(value));
        properties.setHexadecimal(alternativeRepresentationsService.calculateHexadecimal(value));
        this.value = value;
        this.alternativeRepresentationsInfo = properties;
    }

}