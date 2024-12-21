package diegoVSC42.what_the_number.service.properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AdvancedNumPropertiesServiceTest {

    @Autowired
    private AdvancedNumPropertiesService service;

    @Test
    @DisplayName("Returns true when the number is 0 (palindrome check)")
    void calculatePalindromeTest1() {
        //Arrange
        Long number = 0L;
        //Act
        boolean result = service.calculatePalindrome(number);
        //Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Returns false for a very large number (palindrome check)")
    void calculatePalindromeTest2() {
        //Arrange
        Long number = Long.MAX_VALUE;
        //Act
        boolean result = service.calculatePalindrome(number);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Returns true for a valid palindrome number")
    void calculatePalindromeTest3() {
        //Arrange
        Long number = 12321L;
        //Act
        boolean result = service.calculatePalindrome(number);
        //Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Returns false for number 0 (Mersenne prime check)")
    void calculateMersennePrimeTest1() {
        //Arrange
        Long number = 0L;
        //Act
        boolean result = service.calculateMersennePrime(number);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Returns false for a very large number (Mersenne prime check)")
    void calculateMersennePrimeTest2() {
        //Arrange
        Long number = Long.MAX_VALUE;
        //Act
        boolean result = service.calculateMersennePrime(number);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Returns true for a valid Mersenne prime number")
    void calculateMersennePrimeTest3() {
        //Arrange
        Long number = 127L;
        //Act
        boolean result = service.calculateMersennePrime(number);
        //Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Returns false for number 0 (Harshad number check)")
    void calculateHarshadTest1() {
        //Arrange
        Long number = 0L;
        //Act
        boolean result = service.calculateHarshad(number);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Returns false for a very large number (Harshad number check)")
    void calculateHarshadTest2() {
        //Arrange
        Long number = Long.MAX_VALUE;
        //Act
        boolean result = service.calculateHarshad(number);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Returns true for a valid Harshad number")
    void calculateHarshadTest3() {
        //Arrange
        Long number = 18L;
        //Act
        boolean result = service.calculateHarshad(number);
        //Assert
        assertThat(result).isTrue();
    }
}
