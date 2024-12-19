package diegoVSC42.what_the_number.service.properties;

import diegoVSC42.what_the_number.domain.sequences.FibonacciSequence;
import diegoVSC42.what_the_number.domain.sequences.SquareSequence;
import diegoVSC42.what_the_number.domain.sequences.TriangularSequence;
import org.springframework.stereotype.Service;

@Service
public class SequencePropertiesService {
    public FibonacciSequence calculateFibonacciSequence(Long number) {

        Long nthFibonacciTerm = null;
        Long position = null;
        boolean isInFibonacci = false;

        long previousTerm = 0;
        long actualTerm = 1;
        long nextTerm;

        if (number > 3) {
            for (long i = 1; i <= number; i++) {
                nextTerm = previousTerm + actualTerm;
                actualTerm = previousTerm;
                previousTerm = nextTerm;

                if(i == number){
                    nthFibonacciTerm = nextTerm;
                }

                if (nextTerm == number) {
                    isInFibonacci = true;
                    position = i;
                    nthFibonacciTerm = nextTerm;
                }
            }
        } else {
            isInFibonacci = true;
            position = number+1;
            if(number != 0){
                nthFibonacciTerm = number-1;
            }
        }

        return new FibonacciSequence(nthFibonacciTerm, position, isInFibonacci);
    }

    public TriangularSequence calculateTriangularSequence(Long number) {

        long nthTriangularTerm = (number * (number + 1)) / 2;
        Long position = null;
        boolean isInTriangular = false;

        long triangularFactor;

        for (long i = 1; i <= number; i++) {
            triangularFactor = (i * (i + 1)) / 2;
            if (triangularFactor == number) {
                isInTriangular = true;
                position = i;
            }
        }

        return new TriangularSequence(nthTriangularTerm, position, isInTriangular);

    }

    public SquareSequence calculateSquareSequence(Long number) {
        long nthSquareTerm = number * number;
        Long position = null;
        boolean isInSquare = false;

        if (number > 1) {
            for (long i = 0; i <= number / 2; i++) {
                long square = (i * i);
                if (square == number) {
                    isInSquare = true;
                    position = i;
                }
            }
        } else {
            position = number;
            isInSquare = true;
        }
        return new SquareSequence(nthSquareTerm, position, isInSquare);

    }
}
