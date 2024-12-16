package diegoVSC42.what_the_number.service;

public class DigitBasedOperationsService {

    public Long calculateDigitNumber(Long number){
        return (long) number.toString().length();
    }


}
