package diegoVSC42.what_the_number.service.operations;

public class DigitBasedOperationsService {

    public Long calculateNumberOfDigits(Long number){
        return (long) number.toString().length();
    }
    public Long calculateDigitSum(Long number){
        long counter = 0L;
        long digit;
        while (number > 0) {
            digit = number % 10;
            counter += digit;
            number /= 10;
        }
        return counter;
    }
    public Long calculateDigitProduct(Long number) {

        if (number == 0) {
            return 0L;
        }

        long counter = 1L;
        long digit;

        while (number > 0) {
            digit = number % 10;
            counter = counter * digit;
            number /= 10;
        }

        return counter;
    }
}
