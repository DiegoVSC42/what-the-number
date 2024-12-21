package diegoVSC42.what_the_number.service.operations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DigitBasedOperationsServiceTest {

    @Autowired
    private DigitBasedOperationsService service;

    // Test for calculateNumberOfDigits
    @Test
    @DisplayName("Should return 1 for number 0")
    void calculateNumberOfDigitsTest1() {
        // Arrange
        Long number = 0L;
        Long expectedNumber = 1L;
        // Act
        Long result = service.calculateNumberOfDigits(number);
        // Assert
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    @DisplayName("Should return 19 for Long.MAX_VALUE")
    void calculateNumberOfDigitsTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        Long expectedNumber = 19L;
        // Act
        Long result = service.calculateNumberOfDigits(number);
        // Assert
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    @DisplayName("Should return 5 for number 12345")
    void calculateNumberOfDigitsTest3() {
        // Arrange
        Long number = 12345L;
        Long expectedNumber = 5L;
        // Act
        Long result = service.calculateNumberOfDigits(number);
        // Assert
        assertThat(result).isEqualTo(expectedNumber);
    }

    // Test for calculateDigitSum
    @Test
    @DisplayName("Should return 0 for number 0")
    void calculateDigitSumTest1() {
        // Arrange
        Long number = 0L;
        Long expectedResult = 0L;
        // Act
        Long result = service.calculateDigitSum(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return 88 for Long.MAX_VALUE")
    void calculateDigitSumTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        Long expectedResult = 88L;
        // Act
        Long result = service.calculateDigitSum(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return 15 for number 12345")
    void calculateDigitSumTest3() {
        // Arrange
        Long number = 12345L;
        Long expectedResult = 15L;
        // Act
        Long result = service.calculateDigitSum(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    // Test for calculateDigitProduct
    @Test
    @DisplayName("Should return 0 for number 0")
    void calculateDigitProductTest1() {
        // Arrange
        Long number = 0L;
        Long expectedResult = 0L;
        // Act
        Long result = service.calculateDigitProduct(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return 0 for Long.MAX_VALUE")
    void calculateDigitProductTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        Long expectedResult = 0L;
        // Act
        Long result = service.calculateDigitProduct(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return 120 for number 12345")
    void calculateDigitProductTest3() {
        // Arrange
        Long number = 12345L;
        Long expectedResult = 120L;
        // Act
        Long result = service.calculateDigitProduct(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }
}
