package diegoVSC42.what_the_number.domain;

import diegoVSC42.what_the_number.domain.sequences.FibonacciSequence;
import diegoVSC42.what_the_number.domain.sequences.TriangularSequence;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SequencePropertiesInfo {
    private FibonacciSequence fibonacciSequence;
    private TriangularSequence triangularSequence;
}
