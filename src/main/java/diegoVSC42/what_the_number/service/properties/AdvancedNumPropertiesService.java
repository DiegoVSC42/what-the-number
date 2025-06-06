package diegoVSC42.what_the_number.service.properties;

import org.springframework.stereotype.Service;

@Service
public class AdvancedNumPropertiesService {
    public boolean calculateHarshad(Long number) {
        String numStr = String.valueOf(number);
        int digit = 0;
        for (int i = 0; i < numStr.length(); i++) {
            digit = digit + Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        if (number > 0) {
            return number % digit == 0;
        }
        return false;
    }

    public boolean calculatePalindrome(Long number) {
        Long numberAux = number;
        long result = 0L;
        long digit;

        while (numberAux > 0) {
            digit = numberAux % 10;
            result = result * 10 + digit;
            numberAux /= 10;

        }
        if (number == 0) {
            return true;
        }
        return number.equals(result);
    }

    public boolean calculateMersennePrime(Long number) {
        BasicNumPropertiesService basicNumPropertiesService = new BasicNumPropertiesService();
        if (basicNumPropertiesService.isPrime(number)) {
            long powerOfTwo = 2;
            for (long i = 0; i < number; i++) {
                if ((Math.pow(powerOfTwo, i) - 1) == (number)) {
                    return true;
                }
            }
        }

        return number != 0;
    }
}
