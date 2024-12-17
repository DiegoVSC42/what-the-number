package diegoVSC42.what_the_number.service;

import java.util.HashMap;
import java.util.Map;

public class AlternativeRepresentationsService {
    public String calculateBinary(Long number) {
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

    public String calculateHexadecimal(Long number) {
        int digit;
        StringBuilder hexadecimal = new StringBuilder();
        while (number >= 16) {
            digit = (int) (number % 16);
            number = number / 16;
            hexadecimal.append(mapDecimalToHex(digit));
        }
        hexadecimal.append(mapDecimalToHex(Math.toIntExact(number)));
        return hexadecimal.reverse().toString();
    }

    public static String mapDecimalToHex(int value) {
        char[] hexValue = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] decValue = {10, 11, 12, 13, 14, 15};
        Map<Integer, Character> hexMap = new HashMap<>();
        for (int i = 0; i < decValue.length; i++) {
            hexMap.put(decValue[i], hexValue[i]);
        }

        if (hexMap.containsKey(value)) {
            return String.valueOf(hexMap.get(value));
        }

        return String.valueOf(value);

    }
}
