package diegoVSC42.what_the_number.domain.sequences;

public record FibonacciSequence(
        Long nthFibonacciTerm,
        Long position,
        boolean isInFibonacci
) {
}
