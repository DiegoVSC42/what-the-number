package diegoVSC42.what_the_number.service.representations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AlternativeRepresentationsServiceTest {

    @Autowired
    private AlternativeRepresentationsService service;

    // Test for calculateBinary
    @Test
    @DisplayName("Should return '0' for number 0")
    void calculateBinaryTest1() {
        // Arrange
        Long number = 0L;
        String expectedResult = "0";
        // Act
        String result = service.calculateBinary(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return '111111111111111111111111111111111111111111111111111111111111111' for Long.MAX_VALUE")
    void calculateBinaryTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        String expectedResult = "111111111111111111111111111111111111111111111111111111111111111";
        // Act
        String result = service.calculateBinary(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return '1011' for number 11")
    void calculateBinaryTest3() {
        // Arrange
        Long number = 11L;
        String expectedResult = "1011";
        // Act
        String result = service.calculateBinary(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    // Test for calculateHexadecimal
    @Test
    @DisplayName("Should return '0' for number 0")
    void calculateHexadecimalTest1() {
        // Arrange
        Long number = 0L;
        String expectedResult = "0";
        // Act
        String result = service.calculateHexadecimal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return '7FFFFFFFFFFFFFFF' for Long.MAX_VALUE")
    void calculateHexadecimalTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        String expectedResult = "7FFFFFFFFFFFFFFF";
        // Act
        String result = service.calculateHexadecimal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return 'B' for number 11")
    void calculateHexadecimalTest3() {
        // Arrange
        Long number = 11L;
        String expectedResult = "B";
        // Act
        String result = service.calculateHexadecimal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    // Test for calculateOctal
    @Test
    @DisplayName("Should return '0' for number 0")
    void calculateOctalTest1() {
        // Arrange
        Long number = 0L;
        String expectedResult = "0";
        // Act
        String result = service.calculateOctal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return '777777777777777777777' for Long.MAX_VALUE")
    void calculateOctalTest2() {
        // Arrange
        Long number = Long.MAX_VALUE;
        String expectedResult = "777777777777777777777";
        // Act
        String result = service.calculateOctal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Should return '13' for number 11")
    void calculateOctalTest3() {
        // Arrange
        Long number = 11L;
        String expectedResult = "13";
        // Act
        String result = service.calculateOctal(number);
        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }
}
