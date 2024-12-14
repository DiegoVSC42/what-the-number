package diegoVSC42.what_the_number.domain.sequences;

public record TriangularSequence(
        Long nthTriangularTerm,
        Long position,
        boolean isInTriangular
) {
}
