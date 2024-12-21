package diegoVSC42.what_the_number.service.properties;

import diegoVSC42.what_the_number.domain.Parity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BasicNumPropertiesService {

    public  List<Long> calculateDivisors(Long number){
        List<Long> divisors = new ArrayList<>();
        long squareRoot = (long) Math.sqrt(number);

        for (long i = 1; i <= squareRoot; i++) {
            if (number % i == 0) {
                divisors.add(i);
                long currentDivisor = number / i;
                if (i != currentDivisor) {
                    divisors.add(currentDivisor);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public Long calculateDivisorsCount(List<Long> divisors){
        return (long) divisors.size();
    }

    public List<Long> calculateMultiples(Long number){
        List<Long> multiples = new ArrayList<>();
        if(number == 0L || number > Long.MAX_VALUE/10){
            return multiples;
        }
        for(Long i = number; multiples.size() < 10; i += number){
            if(i % number == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }

    public Long calculateFactorial(Long number){
        if(number > 20){
            return null;
        }
        if (number == 0){
            return 1L;
        }
        long factorial = number;
        for(long i = number-1; i > 1 ; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public boolean isPerfect(Long number, List<Long> divisors ){
        if(number == 0 || divisors.isEmpty()){
            return false;
        }
        var sum = divisors.stream().reduce(0L,Long::sum);
        sum = sum - number;
        return sum.equals(number);
    }
    public Parity calculateParity(Long number){
        if(number % 2 == 0){
            return Parity.EVEN;
        }else{
            return Parity.ODD;
        }
    }
    public boolean isPrime(Long number){
        if(number <= 1){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
