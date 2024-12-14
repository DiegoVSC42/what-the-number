package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.sequences.FibonacciSequence;
import diegoVSC42.what_the_number.domain.sequences.TriangularSequence;
import org.springframework.stereotype.Service;

@Service
public class SequencePropertiesService {
    public FibonacciSequence calculateFibonacciSequence(Long number) {

        long nthFibonacciTerm = 1;
        Long position = null;
        boolean isInFibonacci = false;

        long f1 = 1;
        long f2 = 1;
        long fn = 1;

        if(number > 2){
            for(long i = 2; i <= number; i++) {

                if (fn == number){
                    isInFibonacci = true;
                    position = i;
                }

                fn = f1 + f2;

                f2 = f1;
                f1 = fn;

                nthFibonacciTerm = fn;
            }
        }else if(number == 1){
            position = 1L;
            isInFibonacci = true;
        }else if(number == 2){
            position = 3L;
            isInFibonacci = true;
        }




        return new FibonacciSequence(nthFibonacciTerm,position,isInFibonacci);
    }

    public TriangularSequence calculateTriangularSequence(Long number) {

        long nthTriangularTerm = (number*(number+1))/2;
        long position = 0;
        boolean isInTriangular = false;

        long triangularFactor;

        for(long i = 1; i <= number; i++) {
            triangularFactor = (i*(i+1))/2;
            if(triangularFactor == number){
                isInTriangular = true;
                position = i;
            }
        }

        return new TriangularSequence(nthTriangularTerm,position,isInTriangular);

    }
}
