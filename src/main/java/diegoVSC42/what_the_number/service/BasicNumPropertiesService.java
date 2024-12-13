package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.Parity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicNumPropertiesService {

    public  List<Long> calculateDivisors(Long number){
        List<Long> divisors = new ArrayList<Long>();
        for(int i = 1; i <= number;i++){
            if(number % i == 0){
                divisors.add((long) i);
            }
        }
        return divisors;
    }

    public Long calculateDivisorsCount(List<Long> divisors){
        return (long) divisors.size();
    }

    public List<Long> calculateMultiples(Long number){
        List<Long> multiples = new ArrayList<Long>();
        for(Long i = number; multiples.size() < 10; i += number){
            if(i % number == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }

    public Long calculateFatorial(Long number){
        Long factorial = number;
        for(Long i = number-1; i > 1 ; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    public Parity calculateParity(Long number){
        if(number % 2 == 0){
            return Parity.EVEN;
        }else{
            return Parity.ODD;
        }
    }

    public boolean isPerfect(Long number, List<Long> divisors ){
        var sum = divisors.stream().reduce(0L,Long::sum);
        sum = sum - number;
        return sum.equals(number);
    }

    public boolean isPrime(Long divisorsCount){
        return divisorsCount == 2;
    }

}
