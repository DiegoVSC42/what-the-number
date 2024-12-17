package diegoVSC42.what_the_number.service;

public class AlternativeRepresentationsService {
    public String calculateBinary(Long number){
        StringBuilder binary = new StringBuilder();
        long digit;
        while (number >= 2) {
            digit = number % 2;
            number = number / 2;
            binary.append(digit);
        }
        binary.append(number);
        return binary.reverse().toString();
    }
}
