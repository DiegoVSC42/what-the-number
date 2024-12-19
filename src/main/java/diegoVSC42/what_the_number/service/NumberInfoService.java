package diegoVSC42.what_the_number.service;

import diegoVSC42.what_the_number.domain.NumberInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NumberInfoService {
    public NumberInfo calculations(Long number) {
        NumberInfo numberInfo = new NumberInfo();
        numberInfo.calculateBasicNumberProperties(number);
        numberInfo.calculateSequencesProperties(number);
        numberInfo.calculateAdvancedNumberProperties(number);
        numberInfo.calculateDigitBasedOperations(number);
        numberInfo.calculateAlternativeRepresentations(number);
        numberInfo.calculateOtherMathematicalOperations(number);
        System.out.println(Long.MAX_VALUE);
        return numberInfo;
    }
}
