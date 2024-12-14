package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.FibonacciSequence;
import org.springframework.stereotype.Service;

@Service
public class SequencePropertiesService {
    public FibonacciSequence calculateFibonacciSequence(Long number) {

        Long nthFibonacciterm = 1L;
        Long position = number;
        boolean isInFibonacci = false;

        Long f1 = 1L;
        Long f2 = 1L;
        long fn = 1L;

        for(Long i = 2L; i <= number; i++) {

            if (fn == number){
                isInFibonacci = true;
                position = i;
            }

            fn = f1 + f2;

            f2 = f1;
            f1 = fn;
            nthFibonacciterm = fn;
        }

        if(!isInFibonacci && number != 1L){
            position = 0L;
        }

        FibonacciSequence fibonacciSequence = new FibonacciSequence(nthFibonacciterm,position,isInFibonacci);
        return fibonacciSequence;
    }
}
