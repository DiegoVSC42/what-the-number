package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.FibonacciSequence;
import org.springframework.stereotype.Service;

@Service
public class SequencePropertiesService {
    public FibonacciSequence calculateFibonacciSequence(Long number) {

        Long nthFibonacciterm = 1L;
        Long position = 1L;
        boolean isInFibonacci = true;

        Long f1 = 1L;
        Long f2 = 1L;
        long fn = 1L;

        if(number == 2){
            position = 2L;
        }

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

        FibonacciSequence fibonacciSequence = new FibonacciSequence(nthFibonacciterm,position,isInFibonacci);
        return fibonacciSequence;
    }
}
