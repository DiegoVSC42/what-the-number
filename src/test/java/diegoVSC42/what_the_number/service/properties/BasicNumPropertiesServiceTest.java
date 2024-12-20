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
    void calculateMultiples() {
    }

    @Test
    void calculateFactorial() {
    }

    @Test
    void calculateParity() {
    }

    @Test
    void isPerfect() {
    }

    @Test
    void isPrime() {
    }
}