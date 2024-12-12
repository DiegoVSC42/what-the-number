package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.NumberInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicNumProperties {

    public  List<Long> divisors(Long number){
        List<Long> divisors = new ArrayList<Long>();
        for(int i = 1; i <= number;i++){
            if(number % i == 0){
                divisors.add((long) i);
            }
        }
        return divisors;
    }
    public Long divisorsCount(List<Long> divisors){
        return (long) divisors.size();
    }

    public List<Long> multiples(Long number){
        List<Long> multiples = new ArrayList<Long>();
        for(Long i = number ; i <= Long.MAX_VALUE && multiples.size() < 10; i += number){
            if(i % number == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }
//
//    public Long fatorial(Long number){
//
//    }
//
//    public boolean isPrime(Long number){
//
//    }
//    public boolean isPerfect(Long number){
//
//    }



}
