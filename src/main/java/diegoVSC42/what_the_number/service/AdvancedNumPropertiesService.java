package diegoVSC42.what_the_number.service;

public class AdvancedNumPropertiesService {
    public boolean calculateHarshad(Long number){
        String numStr = String.valueOf(number);
        int digit = 0;
        for(int i = 0; i < numStr.length(); i++){
            digit = digit + Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        if(number % digit == 0){
            return true;
        }
        return false;
    }
}
