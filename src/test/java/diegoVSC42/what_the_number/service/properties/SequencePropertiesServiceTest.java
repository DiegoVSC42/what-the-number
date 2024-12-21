package diegoVSC42.what_the_number.service.properties;

import diegoVSC42.what_the_number.domain.sequences.FibonacciSequence;
import diegoVSC42.what_the_number.domain.sequences.SquareSequence;
import diegoVSC42.what_the_number.domain.sequences.TriangularSequence;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SequencePropertiesServiceTest {

    @Autowired
    SequencePropertiesService service;

    // Fibonacci Sequence Tests
    @Test
    @DisplayName("Fibonacci Sequence: nth term should be null for number 0")
    void calculateFibonacciSequenceTest1() {
        Long number = 0L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.nthFibonacciTerm()).isNull();
    }

    @Test
    @DisplayName("Fibonacci Sequence: position should be 1 for number 0")
    void calculateFibonacciSequenceTest2() {
        Long number = 0L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.position()).isEqualTo(1);
    }

    @Test
    @DisplayName("Fibonacci Sequence: number 0 should be in the sequence")
    void calculateFibonacciSequenceTest3() {
        Long number = 0L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.isInFibonacci()).isTrue();
    }

    @Test
    @DisplayName("Fibonacci Sequence: nth term should be null for a very large number")
    void calculateFibonacciSequenceTest4() {
        Long number = Long.MAX_VALUE;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.nthFibonacciTerm()).isNull();
    }

    @Test
    @DisplayName("Fibonacci Sequence: position should be null for a very large number")
    void calculateFibonacciSequenceTest5() {
        Long number = Long.MAX_VALUE;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.position()).isNull();
    }

    @Test
    @DisplayName("Fibonacci Sequence: very large number should not be in the sequence")
    void calculateFibonacciSequenceTest6() {
        Long number = Long.MAX_VALUE;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.isInFibonacci()).isFalse();
    }

    @Test
    @DisplayName("Fibonacci Sequence: nth term should be correct for number 21")
    void calculateFibonacciSequenceTest7() {
        Long number = 21L;
        Long expectedValue = 10946L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.nthFibonacciTerm()).isEqualTo(expectedValue);
    }

    @Test
    @DisplayName("Fibonacci Sequence: position should be correct for number 21")
    void calculateFibonacciSequenceTest8() {
        Long number = 21L;
        Long expectedPosition = 8L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.position()).isEqualTo(expectedPosition);
    }

    @Test
    @DisplayName("Fibonacci Sequence: number 21 should be in the sequence")
    void calculateFibonacciSequenceTest9() {
        Long number = 21L;
        FibonacciSequence result = service.calculateFibonacciSequence(number);
        assertThat(result.isInFibonacci()).isTrue();
    }

    // Triangular Sequence Tests
    @Test
    @DisplayName("Triangular Sequence: nth term should be null for number 0")
    void calculateTriangularSequenceTest1() {
        Long number = 0L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.nthTriangularTerm()).isNull();
    }

    @Test
    @DisplayName("Triangular Sequence: position should be null for number 0")
    void calculateTriangularSequenceTest2() {
        Long number = 0L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.position()).isNull();
    }

    @Test
    @DisplayName("Triangular Sequence: number 0 should not be in the sequence")
    void calculateTriangularSequenceTest3() {
        Long number = 0L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.isInTriangular()).isFalse();
    }

    @Test
    @DisplayName("Triangular Sequence: nth term should be null for a very large number")
    void calculateTriangularSequenceTest4() {
        Long number = Long.MAX_VALUE;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.nthTriangularTerm()).isNull();
    }

    @Test
    @DisplayName("Triangular Sequence: position should be null for a very large number")
    void calculateTriangularSequenceTest5() {
        Long number = Long.MAX_VALUE;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.position()).isNull();
    }

    @Test
    @DisplayName("Triangular Sequence: very large number should not be in the sequence")
    void calculateTriangularSequenceTest6() {
        Long number = Long.MAX_VALUE;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.isInTriangular()).isFalse();
    }

    @Test
    @DisplayName("Triangular Sequence: nth term should be correct for number 21")
    void calculateTriangularSequenceTest7() {
        Long number = 21L;
        Long expectedTerm = 231L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.nthTriangularTerm()).isEqualTo(expectedTerm);
    }

    @Test
    @DisplayName("Triangular Sequence: position should be correct for number 21")
    void calculateTriangularSequenceTest8() {
        Long number = 21L;
        Long expectedPosition = 6L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.position()).isEqualTo(expectedPosition);
    }

    @Test
    @DisplayName("Triangular Sequence: number 21 should be in the sequence")
    void calculateTriangularSequenceTest9() {
        Long number = 21L;
        TriangularSequence result = service.calculateTriangularSequence(number);
        assertThat(result.isInTriangular()).isTrue();
    }

    // Square Sequence Tests
    @Test
    @DisplayName("Square Sequence: nth term should be null for number 0")
    void calculateSquareSequenceTest1() {
        Long number = 0L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.nthSquareTerm()).isNull();
    }

    @Test
    @DisplayName("Square Sequence: position should be null for number 0")
    void calculateSquareSequenceTest2() {
        Long number = 0L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.position()).isNull();
    }

    @Test
    @DisplayName("Square Sequence: number 0 should not be in the sequence")
    void calculateSquareSequenceTest3() {
        Long number = 0L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.isInSquare()).isFalse();
    }

    @Test
    @DisplayName("Square Sequence: nth term should be null for a very large number")
    void calculateSquareSequenceTest4() {
        Long number = Long.MAX_VALUE;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.nthSquareTerm()).isNull();
    }

    @Test
    @DisplayName("Square Sequence: position should be null for a very large number")
    void calculateSquareSequenceTest5() {
        Long number = Long.MAX_VALUE;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.position()).isNull();
    }

    @Test
    @DisplayName("Square Sequence: very large number should not be in the sequence")
    void calculateSquareSequenceTest6() {
        Long number = Long.MAX_VALUE;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.isInSquare()).isFalse();
    }

    @Test
    @DisplayName("Square Sequence: nth term should be correct for number 25")
    void calculateSquareSequenceTest7() {
        Long number = 25L;
        Long expectedTerm = 625L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.nthSquareTerm()).isEqualTo(expectedTerm);
    }

    @Test
    @DisplayName("Square Sequence: position should be correct for number 25")
    void calculateSquareSequenceTest8() {
        Long number = 25L;
        Long expectedPosition = 5L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.position()).isEqualTo(expectedPosition);
    }

    @Test
    @DisplayName("Square Sequence: number 25 should be in the sequence")
    void calculateSquareSequenceTest9() {
        Long number = 25L;
        SquareSequence result = service.calculateSquareSequence(number);
        assertThat(result.isInSquare()).isTrue();
    }
}
