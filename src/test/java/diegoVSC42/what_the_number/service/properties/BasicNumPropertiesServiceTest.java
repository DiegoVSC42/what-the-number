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
    private BasicNumPropertiesService basicNumPropertiesService;

    @Test
    @DisplayName("Should return all divisors of a number with multiple divisors")
    void calculateDivisorsTest1() {
        //Arrange
        Long number = 42L;
        List<Long> expectedDivisors = new ArrayList<>(List.of(1L,2L,3L,6L,7L,14L,21L,42L));
        //Act
        List<Long> divisors = basicNumPropertiesService.calculateDivisors(number);
        //Assert
        assertThat(divisors).isEqualTo(expectedDivisors);
    }
    @Test
    @DisplayName("Should return only two divisors of a prime number")
    void calculateDivisorsTest2() {
        //Arrange
        Long number = 137L;
        //Act
        List<Long> divisors = basicNumPropertiesService.calculateDivisors(number);
        //Assert
        assertThat(divisors.size()).isEqualTo(2);
    }
    @Test
    @DisplayName("Should return a empty list for number 0")
    void calculateDivisorsTest3(){
        //Arrange
        Long number = 0L;
        //Act
        List<Long> divisors = basicNumPropertiesService.calculateDivisors(number);
        //Assert
        assertThat(divisors).isEmpty();
    }

    @Test
    @DisplayName("Should return a list with ten elements for a regular number")
    void calculateMultiplesTest1() {
        //Arrange
        Long number = 42L;
        //Act
        List<Long> multiples = basicNumPropertiesService.calculateMultiples(number);
        //Asser
        assertThat(multiples.size()).isEqualTo(10);
    }
    @Test
    @DisplayName("Should return a empty list for number zero")
    void calculateMultiplesTest2() {
        //Arrange
        Long number = 0L;
        //Act
        List<Long> multiples = basicNumPropertiesService.calculateMultiples(number);
        //Asser
        assertThat(multiples).isEmpty();
    }
    @Test
    @DisplayName("Should return a empty list for a big number")
    void calculateMultiplesTest3() {
        //Arrange
        Long number = Long.MAX_VALUE/9;
        //Act
        List<Long> multiples = basicNumPropertiesService.calculateMultiples(number);
        //Assert
        assertThat(multiples).isEmpty();
    }

    @Test
    @DisplayName("Should return the result of the factorial calculation for a regular number")
    void calculateFactorialTest1() {
        //Arrange
        Long number = 12L;
        Long expectedResult =  479001600L;
        //Act
        Long result = basicNumPropertiesService.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    @DisplayName("Should return null for a number bigger than 20")
    void calculateFactorialTest2() {
        //Arrange
        Long number = 42L;
        //Act
        Long result = basicNumPropertiesService.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(null);
    }
    @Test
    @DisplayName("Should return one for number zero")
    void calculateFactorialTest3() {
        //Arrange
        Long number = 0L;
        //Act
        Long result = basicNumPropertiesService.calculateFactorial(number);
        //Assert
        assertThat(result).isEqualTo(1L);
    }

    @Test
    @DisplayName("Should return true for a prime number")
    void isPrimeTest1() {
        //Arrange
        Long number = 13L;
        //Act
        boolean result = basicNumPropertiesService.isPrime(number);
        assertThat(result).isTrue();
    }
    @Test
    @DisplayName("Should return false for number zero")
    void isPrimeTest2() {
        //Arrange
        Long number = 0L;
        //Act
        boolean result = basicNumPropertiesService.isPrime(number);
        assertThat(result).isFalse();
    }


}