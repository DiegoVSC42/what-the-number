package diegoVSC42.what_the_number.service;

public class AdvancedNumPropertiesService {
    public boolean calculateHarshad(Long number) {
        String numStr = String.valueOf(number);
        int digit = 0;
        for (int i = 0; i < numStr.length(); i++) {
            digit = digit + Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        return number % digit == 0;
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

        return number.equals(result);
    }
}
