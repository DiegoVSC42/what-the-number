package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.sequences.FibonacciSequence;
import diegoVSC42.what_the_number.domain.sequences.TriangularSequence;
import org.springframework.stereotype.Service;

@Service
public class SequencePropertiesService {
    public FibonacciSequence calculateFibonacciSequence(Long number) {

        long nthFibonacciTerm = 1L;
        long position = number;
        boolean isInFibonacci = false;

        long f1 = 1L;
        long f2 = 1L;
        long fn = 1L;

        for(long i = 2L; i <= number; i++) {

            if (fn == number){
                isInFibonacci = true;
                position = i;
            }

            fn = f1 + f2;

            f2 = f1;
            f1 = fn;
            nthFibonacciTerm = fn;
        }

        if(!isInFibonacci && number != 1L){
            position = 0L;
        }

        return new FibonacciSequence(nthFibonacciTerm,position,isInFibonacci);
    }

    public TriangularSequence calculateTriangularSequence(Long number) {

        long nthTriangularTerm = (number*(number+1))/2;
        long position = 0L;
        boolean isInTriangular = false;

        long triangularFactor;

        for(long i = 1L; i <= number; i++) {
            triangularFactor = (i*(i+1))/2;
            if(triangularFactor == number){
                isInTriangular = true;
                position = i;
            }
        }

        return new TriangularSequence(nthTriangularTerm,position,isInTriangular);

    }
}
