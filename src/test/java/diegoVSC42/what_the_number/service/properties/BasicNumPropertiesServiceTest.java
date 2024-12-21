package diegoVSC42.what_the_number.service.properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BasicNumPropertiesServiceTest {

    @Autowired
    private BasicNumPropertiesService service;

    @Test
    @DisplayName("Returns all divisors of a number with multiple divisors")
    void calculateDivisorsTest1() {
        //Arrange
        Long number = 42L;
        List<Long> expectedDivisors = new ArrayList<>(List.of(1L, 2L, 3L, 6L, 7L, 14L, 21L, 42L));
        //Act
        List<Long> divisors = service.calculateDivisors(number);
        //Assert
        assertThat(divisors).isEqualTo(expectedDivisors);
    }

    @Test
    @DisplayName("Returns only two divisors for a prime number")
    void calculateDivisorsTest2() {
        //Arrange
        Long number = 137L;
        //Act
        List<Long> divisors = service.calculateDivisors(number);
        //Assert
        assertThat(divisors.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("Returns an empty list for divisors of zero")
    void calculateDivisorsTest3() {
        //Arrange
        Long number = 0L;
        //Act
        List<Long> divisors = service.calculateDivisors(number);
        //Assert
        assertThat(divisors).isEmpty();
    }

    @Test
    @DisplayName("Returns a list of 10 multiples for a regular number")
    void calculateMultiplesTest1() {
        //Arrange
        Long number = 42L;
        //Act
        List<Long> multiples = service.calculateMultiples(number);
        //Assert
        assertThat(multiples.size()).isEqualTo(10);
    }

    @Test
    @DisplayName("Returns an empty list for multiples of zero")
    void calculateMultiplesTest2() {
        //Arrange
        Long number = 0L;
        //Act
        List<Long> multiples = service.calculateMultiples(number);
        //Assert
        assertThat(multiples).isEmpty();
    }

    @Test
    @DisplayName("Returns an empty list for multiples of a very large number")
    void calculateMultiplesTest3() {
        //Arrange
        Long number = Long.MAX_VALUE / 9;
        //Act
        List<Long> multiples = service.calculateMultiples(number);
        //Assert
        assertThat(multiples).isEmpty();
    }

    @Test
    @DisplayName("Calculates the factorial of a regular number")
    void calculateFactorialTest1() {
        //Arrange
        Long number = 12L;
        Long expectedResult = 479001600L;
        //Act
        Long result = service.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Returns null for factorial of a number greater than 20")
    void calculateFactorialTest2() {
        //Arrange
        Long number = 42L;
        //Act
        Long result = service.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(null);
    }

    @Test
    @DisplayName("Returns 1 as the factorial of zero")
    void calculateFactorialTest3() {
        //Arrange
        Long number = 0L;
        //Act
        Long result = service.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(1L);
    }

    @Test
    @DisplayName("Identifies a prime number as true")
    void isPrimeTest1() {
        //Arrange
        Long number = 13L;
        //Act
        boolean result = service.isPrime(number);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Identifies zero as not prime")
    void isPrimeTest2() {
        //Arrange
        Long number = 0L;
        //Act
        boolean result = service.isPrime(number);
        assertThat(result).isFalse();
    }
}
